// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/XOptimizer.g 2014-06-17 09:47:32
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XOptimizer extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "COND", "DECLARE", 
		"DIGIT", "FLOAT", "ID", "INT", "LETTER", "NUMBER", "OTHER", "STRING", 
		"TYPE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", 
		"':='", "';'", "'<'", "'='", "'>'", "'begin'", "'else'", "'end'", "'for'", 
		"'if'", "'print'", "'program'", "'read'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int COND=6;
	public static final int DECLARE=7;
	public static final int DIGIT=8;
	public static final int FLOAT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int LETTER=12;
	public static final int NUMBER=13;
	public static final int OTHER=14;
	public static final int STRING=15;
	public static final int TYPE=16;
	public static final int WS=17;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XOptimizer(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XOptimizer(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return XOptimizer.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/XOptimizer.g"; }



	// $ANTLR start "rule"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/XOptimizer.g:13:1: rule :;
	public final void rule() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/XOptimizer.g:13:5: ()
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/XOptimizer.g:13:7: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rule"

	// Delegated rules



}
