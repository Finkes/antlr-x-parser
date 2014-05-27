package dhbw.compilerbau.xparser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import javax.xml.bind.annotation.XmlList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;

import dhbw.compilerbau.xparser.XLexer;
import dhbw.compilerbau.xparser.XParser;
import dhbw.compilerbau.xparser.XParser.program_return;



public class XTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//load testfile from folder
			FileInputStream fileInputStream = new FileInputStream(new File("x/Test6.x"));
			
			//create ANTLR input stream
			ANTLRInputStream inputStream = new ANTLRInputStream(fileInputStream);
			
			//create lexer
			XLexer lexer = new XLexer(inputStream);
			
			//Buffer for tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			//create parser
			XParser parser = new XParser(tokens);
			
			//start parser at it's first rule
			program_return result = parser.program();
			CommonTree tree = (CommonTree)result.getTree();
			
			//log tree to console
			System.out.println(tree.toStringTree());
			
			DOTTreeGenerator genarator = new DOTTreeGenerator();
			
			PrintWriter writer = new PrintWriter(new File("graphviz/graph"));
        	
        	writer.write(genarator.toDOT(tree).toString());
        	
        	writer.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
