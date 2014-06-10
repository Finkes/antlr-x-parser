package dhbw.compilerbau.xparser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.xml.bind.annotation.XmlList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;

import dhbw.compilerbau.xparser.XLexer;
import dhbw.compilerbau.xparser.XParser;
import dhbw.compilerbau.xparser.X_Variable_Declaration;
import dhbw.compilerbau.xparser.XParser.program_return;
import dhbw.compilerbau.xparser.X_Reference_Counter;



public class XTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//load testfile from folder
			FileInputStream fileInputStream = new FileInputStream(new File("x/Test8.x"));
			
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
        	
        	
        	//reference counter
        	X_Reference_Counter reference_counter = new X_Reference_Counter(new CommonTreeNodeStream(tree));
        	
        	CommonTree reference_counter_tree = reference_counter.program().getTree();
        	
        	writer = new PrintWriter(new File("graphviz/graph_reference_counter"));
        	
        	writer.write(genarator.toDOT(reference_counter_tree).toString());
        	
        	writer.close();
        	
        	System.out.println("num of assignments: "+reference_counter.num_assignments);
        	
        	
        	Enumeration keys = reference_counter.references.keys();
        	
        	
        	int max = 0;
        	String max_id = "";
        	
        	while(keys.hasMoreElements())
        	{
        		String key = keys.nextElement().toString();
        		
        		int count = (int)reference_counter.references.get(key);
        		
        		if(count > max)
        		{
        			max = count;
        			max_id = key;
        		}
        	}
        	
        	System.out.println("most assignments to " + max_id +" ("+max+")");
        	
        	//variable check
        	
        	X_Variable_Declaration decl = new X_Variable_Declaration(new CommonTreeNodeStream(reference_counter_tree));
        	
        	decl.program();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
