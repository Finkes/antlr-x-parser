// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g 2014-06-17 10:04:26
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "COND", "DECLARE", 
		"DIGIT", "FLOAT", "ID", "INT", "LETTER", "NUMBER", "OTHER", "POSDIGIT", 
		"STRING", "TYPE", "WS", "ZERO", "'('", "')'", "'*'", "'+'", "'-'", "'.'", 
		"'/'", "':'", "':='", "';'", "'<'", "'='", "'>'", "'begin'", "'else'", 
		"'end'", "'for'", "'if'", "'print'", "'program'", "'read'", "'then'", 
		"'while'"
	};
	public static final int EOF=-1;
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
	public static final int T__41=41;
	public static final int T__42=42;
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
	public static final int POSDIGIT=15;
	public static final int STRING=16;
	public static final int TYPE=17;
	public static final int WS=18;
	public static final int ZERO=19;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:52:1: program : 'program' ID ';' decllist block '.' EOF -> ^( 'program' ID ( decllist )* block ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal1=null;
		XToken ID2=null;
		XToken char_literal3=null;
		XToken char_literal6=null;
		XToken EOF7=null;
		ParserRuleReturnScope decllist4 =null;
		ParserRuleReturnScope block5 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object char_literal6_tree=null;
		Object EOF7_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_decllist=new RewriteRuleSubtreeStream(adaptor,"rule decllist");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:52:9: ( 'program' ID ';' decllist block '.' EOF -> ^( 'program' ID ( decllist )* block ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:52:17: 'program' ID ';' decllist block '.' EOF
			{
			string_literal1=(XToken)match(input,39,FOLLOW_39_in_program85);  
			stream_39.add(string_literal1);

			ID2=(XToken)match(input,ID,FOLLOW_ID_in_program87);  
			stream_ID.add(ID2);

			char_literal3=(XToken)match(input,29,FOLLOW_29_in_program89);  
			stream_29.add(char_literal3);

			pushFollow(FOLLOW_decllist_in_program91);
			decllist4=decllist();
			state._fsp--;

			stream_decllist.add(decllist4.getTree());
			pushFollow(FOLLOW_block_in_program93);
			block5=block();
			state._fsp--;

			stream_block.add(block5.getTree());
			char_literal6=(XToken)match(input,25,FOLLOW_25_in_program95);  
			stream_25.add(char_literal6);

			EOF7=(XToken)match(input,EOF,FOLLOW_EOF_in_program97);  
			stream_EOF.add(EOF7);

			// AST REWRITE
			// elements: block, ID, 39, decllist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:17: -> ^( 'program' ID ( decllist )* block )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:53:20: ^( 'program' ID ( decllist )* block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:53:35: ( decllist )*
				while ( stream_decllist.hasNext() ) {
					adaptor.addChild(root_1, stream_decllist.nextTree());
				}
				stream_decllist.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class decllist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:1: decllist : ( decl )* -> ( ^( DECLARE decl ) )* ;
	public final XParser.decllist_return decllist() throws RecognitionException {
		XParser.decllist_return retval = new XParser.decllist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decl8 =null;

		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:9: ( ( decl )* -> ( ^( DECLARE decl ) )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:17: ( decl )*
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:17: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==38||LA1_0==40) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:17: decl
					{
					pushFollow(FOLLOW_decl_in_decllist141);
					decl8=decl();
					state._fsp--;

					stream_decl.add(decl8.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:17: -> ( ^( DECLARE decl ) )*
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:56:20: ( ^( DECLARE decl ) )*
				while ( stream_decl.hasNext() ) {
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:56:20: ^( DECLARE decl )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARE, "DECLARE"), root_1);
					adaptor.addChild(root_1, stream_decl.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_decl.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:58:1: block : 'begin' statlist 'end' -> ^( BLOCK statlist ) ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal9=null;
		XToken string_literal11=null;
		ParserRuleReturnScope statlist10 =null;

		Object string_literal9_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_statlist=new RewriteRuleSubtreeStream(adaptor,"rule statlist");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:58:6: ( 'begin' statlist 'end' -> ^( BLOCK statlist ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:58:17: 'begin' statlist 'end'
			{
			string_literal9=(XToken)match(input,33,FOLLOW_33_in_block239);  
			stream_33.add(string_literal9);

			pushFollow(FOLLOW_statlist_in_block241);
			statlist10=statlist();
			state._fsp--;

			stream_statlist.add(statlist10.getTree());
			string_literal11=(XToken)match(input,35,FOLLOW_35_in_block243);  
			stream_35.add(string_literal11);

			// AST REWRITE
			// elements: statlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:17: -> ^( BLOCK statlist )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:59:20: ^( BLOCK statlist )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_statlist.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:1: statlist : ( statswithsemi )* ;
	public final XParser.statlist_return statlist() throws RecognitionException {
		XParser.statlist_return retval = new XParser.statlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statswithsemi12 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:9: ( ( statswithsemi )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:17: ( statswithsemi )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:17: ( statswithsemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||LA2_0==33||(LA2_0 >= 36 && LA2_0 <= 37)||LA2_0==42) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:17: statswithsemi
					{
					pushFollow(FOLLOW_statswithsemi_in_statlist297);
					statswithsemi12=statswithsemi();
					state._fsp--;

					adaptor.addChild(root_0, statswithsemi12.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class statswithsemi_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statswithsemi"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:63:1: statswithsemi : stat ';' !;
	public final XParser.statswithsemi_return statswithsemi() throws RecognitionException {
		XParser.statswithsemi_return retval = new XParser.statswithsemi_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken char_literal14=null;
		ParserRuleReturnScope stat13 =null;

		Object char_literal14_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:63:14: ( stat ';' !)
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:63:17: stat ';' !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_stat_in_statswithsemi306);
			stat13=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat13.getTree());

			char_literal14=(XToken)match(input,29,FOLLOW_29_in_statswithsemi308); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statswithsemi"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:1: stat : ( assignstat | condstat | whilestat | forstat | block );
	public final XParser.stat_return stat() throws RecognitionException {
		XParser.stat_return retval = new XParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignstat15 =null;
		ParserRuleReturnScope condstat16 =null;
		ParserRuleReturnScope whilestat17 =null;
		ParserRuleReturnScope forstat18 =null;
		ParserRuleReturnScope block19 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:5: ( assignstat | condstat | whilestat | forstat | block )
			int alt3=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case 37:
				{
				alt3=2;
				}
				break;
			case 42:
				{
				alt3=3;
				}
				break;
			case 36:
				{
				alt3=4;
				}
				break;
			case 33:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:17: assignstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignstat_in_stat327);
					assignstat15=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat15.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:30: condstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condstat_in_stat331);
					condstat16=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat16.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:41: whilestat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whilestat_in_stat335);
					whilestat17=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat17.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:53: forstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forstat_in_stat339);
					forstat18=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat18.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:63: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat343);
					block19=block();
					state._fsp--;

					adaptor.addChild(root_0, block19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:67:1: cond : expr comparator expr -> ^( comparator expr expr ) ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr20 =null;
		ParserRuleReturnScope comparator21 =null;
		ParserRuleReturnScope expr22 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_comparator=new RewriteRuleSubtreeStream(adaptor,"rule comparator");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:67:5: ( expr comparator expr -> ^( comparator expr expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:67:17: expr comparator expr
			{
			pushFollow(FOLLOW_expr_in_cond361);
			expr20=expr();
			state._fsp--;

			stream_expr.add(expr20.getTree());
			pushFollow(FOLLOW_comparator_in_cond363);
			comparator21=comparator();
			state._fsp--;

			stream_comparator.add(comparator21.getTree());
			pushFollow(FOLLOW_expr_in_cond365);
			expr22=expr();
			state._fsp--;

			stream_expr.add(expr22.getTree());
			// AST REWRITE
			// elements: expr, expr, comparator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:17: -> ^( comparator expr expr )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:68:20: ^( comparator expr expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_comparator.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class condstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:70:1: condstat : 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? ;
	public final XParser.condstat_return condstat() throws RecognitionException {
		XParser.condstat_return retval = new XParser.condstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal23=null;
		XToken string_literal25=null;
		XToken string_literal27=null;
		ParserRuleReturnScope cond24 =null;
		ParserRuleReturnScope stat26 =null;
		ParserRuleReturnScope stat28 =null;

		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		Object string_literal27_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:70:9: ( 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:70:17: 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(XToken)match(input,37,FOLLOW_37_in_condstat422); 
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			root_0 = (Object)adaptor.becomeRoot(string_literal23_tree, root_0);

			pushFollow(FOLLOW_cond_in_condstat425);
			cond24=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond24.getTree());

			string_literal25=(XToken)match(input,41,FOLLOW_41_in_condstat427); 
			pushFollow(FOLLOW_stat_in_condstat430);
			stat26=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat26.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:70:41: ( options {greedy=true; } : 'else' ! stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==34) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:70:64: 'else' ! stat
					{
					string_literal27=(XToken)match(input,34,FOLLOW_34_in_condstat440); 
					pushFollow(FOLLOW_stat_in_condstat443);
					stat28=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat28.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class whilestat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:72:1: whilestat : 'while' '(' cond ')' stat -> ^( 'while' cond stat ) ;
	public final XParser.whilestat_return whilestat() throws RecognitionException {
		XParser.whilestat_return retval = new XParser.whilestat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal29=null;
		XToken char_literal30=null;
		XToken char_literal32=null;
		ParserRuleReturnScope cond31 =null;
		ParserRuleReturnScope stat33 =null;

		Object string_literal29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:72:10: ( 'while' '(' cond ')' stat -> ^( 'while' cond stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:72:17: 'while' '(' cond ')' stat
			{
			string_literal29=(XToken)match(input,42,FOLLOW_42_in_whilestat458);  
			stream_42.add(string_literal29);

			char_literal30=(XToken)match(input,20,FOLLOW_20_in_whilestat460);  
			stream_20.add(char_literal30);

			pushFollow(FOLLOW_cond_in_whilestat462);
			cond31=cond();
			state._fsp--;

			stream_cond.add(cond31.getTree());
			char_literal32=(XToken)match(input,21,FOLLOW_21_in_whilestat464);  
			stream_21.add(char_literal32);

			pushFollow(FOLLOW_stat_in_whilestat466);
			stat33=stat();
			state._fsp--;

			stream_stat.add(stat33.getTree());
			// AST REWRITE
			// elements: stat, cond, 42
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:17: -> ^( 'while' cond stat )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:73:20: ^( 'while' cond stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:75:1: forstat : 'for' '(' assignstat ';' cond ';' assignstat ')' stat -> ^( 'for' assignstat cond assignstat stat ) ;
	public final XParser.forstat_return forstat() throws RecognitionException {
		XParser.forstat_return retval = new XParser.forstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal34=null;
		XToken char_literal35=null;
		XToken char_literal37=null;
		XToken char_literal39=null;
		XToken char_literal41=null;
		ParserRuleReturnScope assignstat36 =null;
		ParserRuleReturnScope cond38 =null;
		ParserRuleReturnScope assignstat40 =null;
		ParserRuleReturnScope stat42 =null;

		Object string_literal34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		Object char_literal41_tree=null;
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_assignstat=new RewriteRuleSubtreeStream(adaptor,"rule assignstat");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:75:8: ( 'for' '(' assignstat ';' cond ';' assignstat ')' stat -> ^( 'for' assignstat cond assignstat stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:75:17: 'for' '(' assignstat ';' cond ';' assignstat ')' stat
			{
			string_literal34=(XToken)match(input,36,FOLLOW_36_in_forstat523);  
			stream_36.add(string_literal34);

			char_literal35=(XToken)match(input,20,FOLLOW_20_in_forstat525);  
			stream_20.add(char_literal35);

			pushFollow(FOLLOW_assignstat_in_forstat527);
			assignstat36=assignstat();
			state._fsp--;

			stream_assignstat.add(assignstat36.getTree());
			char_literal37=(XToken)match(input,29,FOLLOW_29_in_forstat529);  
			stream_29.add(char_literal37);

			pushFollow(FOLLOW_cond_in_forstat531);
			cond38=cond();
			state._fsp--;

			stream_cond.add(cond38.getTree());
			char_literal39=(XToken)match(input,29,FOLLOW_29_in_forstat533);  
			stream_29.add(char_literal39);

			pushFollow(FOLLOW_assignstat_in_forstat535);
			assignstat40=assignstat();
			state._fsp--;

			stream_assignstat.add(assignstat40.getTree());
			char_literal41=(XToken)match(input,21,FOLLOW_21_in_forstat537);  
			stream_21.add(char_literal41);

			pushFollow(FOLLOW_stat_in_forstat539);
			stat42=stat();
			state._fsp--;

			stream_stat.add(stat42.getTree());
			// AST REWRITE
			// elements: 36, cond, stat, assignstat, assignstat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:17: -> ^( 'for' assignstat cond assignstat stat )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:76:20: ^( 'for' assignstat cond assignstat stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);
				adaptor.addChild(root_1, stream_assignstat.nextTree());
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_assignstat.nextTree());
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class assignstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:78:1: assignstat : ID ':=' expr -> ^( ASSIGN ID expr ) ;
	public final XParser.assignstat_return assignstat() throws RecognitionException {
		XParser.assignstat_return retval = new XParser.assignstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken ID43=null;
		XToken string_literal44=null;
		ParserRuleReturnScope expr45 =null;

		Object ID43_tree=null;
		Object string_literal44_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:78:11: ( ID ':=' expr -> ^( ASSIGN ID expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:78:17: ID ':=' expr
			{
			ID43=(XToken)match(input,ID,FOLLOW_ID_in_assignstat597);  
			stream_ID.add(ID43);

			string_literal44=(XToken)match(input,28,FOLLOW_28_in_assignstat599);  
			stream_28.add(string_literal44);

			pushFollow(FOLLOW_expr_in_assignstat601);
			expr45=expr();
			state._fsp--;

			stream_expr.add(expr45.getTree());
			// AST REWRITE
			// elements: ID, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:17: -> ^( ASSIGN ID expr )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:79:20: ^( ASSIGN ID expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:81:1: expr : expr2 ( addOperator ^ expr )? ;
	public final XParser.expr_return expr() throws RecognitionException {
		XParser.expr_return retval = new XParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr246 =null;
		ParserRuleReturnScope addOperator47 =null;
		ParserRuleReturnScope expr48 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:81:5: ( expr2 ( addOperator ^ expr )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:81:17: expr2 ( addOperator ^ expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr661);
			expr246=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr246.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:81:23: ( addOperator ^ expr )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 23 && LA5_0 <= 24)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:81:24: addOperator ^ expr
					{
					pushFollow(FOLLOW_addOperator_in_expr664);
					addOperator47=addOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addOperator47.getTree(), root_0);
					pushFollow(FOLLOW_expr_in_expr667);
					expr48=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr48.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:83:1: expr2 : expr3 ( multOperator ^ expr2 )? ;
	public final XParser.expr2_return expr2() throws RecognitionException {
		XParser.expr2_return retval = new XParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr349 =null;
		ParserRuleReturnScope multOperator50 =null;
		ParserRuleReturnScope expr251 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:83:6: ( expr3 ( multOperator ^ expr2 )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:83:17: expr3 ( multOperator ^ expr2 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr2685);
			expr349=expr3();
			state._fsp--;

			adaptor.addChild(root_0, expr349.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:83:23: ( multOperator ^ expr2 )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==22||LA6_0==26) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:83:24: multOperator ^ expr2
					{
					pushFollow(FOLLOW_multOperator_in_expr2688);
					multOperator50=multOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(multOperator50.getTree(), root_0);
					pushFollow(FOLLOW_expr2_in_expr2691);
					expr251=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr251.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2"


	public static class expr3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr3"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:1: expr3 : ( INT | FLOAT | ID | '(' ! expr ')' !| STRING );
	public final XParser.expr3_return expr3() throws RecognitionException {
		XParser.expr3_return retval = new XParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken INT52=null;
		XToken FLOAT53=null;
		XToken ID54=null;
		XToken char_literal55=null;
		XToken char_literal57=null;
		XToken STRING58=null;
		ParserRuleReturnScope expr56 =null;

		Object INT52_tree=null;
		Object FLOAT53_tree=null;
		Object ID54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		Object STRING58_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:6: ( INT | FLOAT | ID | '(' ! expr ')' !| STRING )
			int alt7=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case FLOAT:
				{
				alt7=2;
				}
				break;
			case ID:
				{
				alt7=3;
				}
				break;
			case 20:
				{
				alt7=4;
				}
				break;
			case STRING:
				{
				alt7=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:17: INT
					{
					root_0 = (Object)adaptor.nil();


					INT52=(XToken)match(input,INT,FOLLOW_INT_in_expr3709); 
					INT52_tree = (Object)adaptor.create(INT52);
					adaptor.addChild(root_0, INT52_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:23: FLOAT
					{
					root_0 = (Object)adaptor.nil();


					FLOAT53=(XToken)match(input,FLOAT,FOLLOW_FLOAT_in_expr3713); 
					FLOAT53_tree = (Object)adaptor.create(FLOAT53);
					adaptor.addChild(root_0, FLOAT53_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:31: ID
					{
					root_0 = (Object)adaptor.nil();


					ID54=(XToken)match(input,ID,FOLLOW_ID_in_expr3717); 
					ID54_tree = (Object)adaptor.create(ID54);
					adaptor.addChild(root_0, ID54_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:36: '(' ! expr ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal55=(XToken)match(input,20,FOLLOW_20_in_expr3721); 
					pushFollow(FOLLOW_expr_in_expr3724);
					expr56=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr56.getTree());

					char_literal57=(XToken)match(input,21,FOLLOW_21_in_expr3726); 
					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:85:53: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING58=(XToken)match(input,STRING,FOLLOW_STRING_in_expr3731); 
					STRING58_tree = (Object)adaptor.create(STRING58);
					adaptor.addChild(root_0, STRING58_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr3"


	public static class addOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addOperator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:87:1: addOperator : ( '+' | '-' );
	public final XParser.addOperator_return addOperator() throws RecognitionException {
		XParser.addOperator_return retval = new XParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken set59=null;

		Object set59_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:87:12: ( '+' | '-' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set59=(XToken)input.LT(1);
			if ( (input.LA(1) >= 23 && input.LA(1) <= 24) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set59));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addOperator"


	public static class multOperator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multOperator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:88:1: multOperator : ( '*' | '/' );
	public final XParser.multOperator_return multOperator() throws RecognitionException {
		XParser.multOperator_return retval = new XParser.multOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken set60=null;

		Object set60_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:88:13: ( '*' | '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set60=(XToken)input.LT(1);
			if ( input.LA(1)==22||input.LA(1)==26 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set60));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multOperator"


	public static class comparator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:89:1: comparator : ( '<' | '>' | '=' );
	public final XParser.comparator_return comparator() throws RecognitionException {
		XParser.comparator_return retval = new XParser.comparator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken set61=null;

		Object set61_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:89:11: ( '<' | '>' | '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set61=(XToken)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set61));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparator"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:91:1: decl : modifier ID ':' ! TYPE ';' !;
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken ID63=null;
		XToken char_literal64=null;
		XToken TYPE65=null;
		XToken char_literal66=null;
		ParserRuleReturnScope modifier62 =null;

		Object ID63_tree=null;
		Object char_literal64_tree=null;
		Object TYPE65_tree=null;
		Object char_literal66_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:91:5: ( modifier ID ':' ! TYPE ';' !)
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:91:17: modifier ID ':' ! TYPE ';' !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_modifier_in_decl787);
			modifier62=modifier();
			state._fsp--;

			adaptor.addChild(root_0, modifier62.getTree());

			ID63=(XToken)match(input,ID,FOLLOW_ID_in_decl789); 
			ID63_tree = (Object)adaptor.create(ID63);
			adaptor.addChild(root_0, ID63_tree);

			char_literal64=(XToken)match(input,27,FOLLOW_27_in_decl791); 
			TYPE65=(XToken)match(input,TYPE,FOLLOW_TYPE_in_decl794); 
			TYPE65_tree = (Object)adaptor.create(TYPE65);
			adaptor.addChild(root_0, TYPE65_tree);

			char_literal66=(XToken)match(input,29,FOLLOW_29_in_decl796); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class modifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:1: modifier : ( 'read' 'print' | 'read' | 'print' )? ;
	public final XParser.modifier_return modifier() throws RecognitionException {
		XParser.modifier_return retval = new XParser.modifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		XToken string_literal67=null;
		XToken string_literal68=null;
		XToken string_literal69=null;
		XToken string_literal70=null;

		Object string_literal67_tree=null;
		Object string_literal68_tree=null;
		Object string_literal69_tree=null;
		Object string_literal70_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:9: ( ( 'read' 'print' | 'read' | 'print' )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:17: ( 'read' 'print' | 'read' | 'print' )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:17: ( 'read' 'print' | 'read' | 'print' )?
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==40) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==38) ) {
					alt8=1;
				}
				else if ( (LA8_1==ID) ) {
					alt8=2;
				}
			}
			else if ( (LA8_0==38) ) {
				alt8=3;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:18: 'read' 'print'
					{
					string_literal67=(XToken)match(input,40,FOLLOW_40_in_modifier810); 
					string_literal67_tree = (Object)adaptor.create(string_literal67);
					adaptor.addChild(root_0, string_literal67_tree);

					string_literal68=(XToken)match(input,38,FOLLOW_38_in_modifier812); 
					string_literal68_tree = (Object)adaptor.create(string_literal68);
					adaptor.addChild(root_0, string_literal68_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:35: 'read'
					{
					string_literal69=(XToken)match(input,40,FOLLOW_40_in_modifier816); 
					string_literal69_tree = (Object)adaptor.create(string_literal69);
					adaptor.addChild(root_0, string_literal69_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:92:44: 'print'
					{
					string_literal70=(XToken)match(input,38,FOLLOW_38_in_modifier820); 
					string_literal70_tree = (Object)adaptor.create(string_literal70);
					adaptor.addChild(root_0, string_literal70_tree);

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"

	// Delegated rules



	public static final BitSet FOLLOW_39_in_program85 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_program87 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_program89 = new BitSet(new long[]{0x0000014200000400L});
	public static final BitSet FOLLOW_decllist_in_program91 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_program93 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program95 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decllist141 = new BitSet(new long[]{0x0000014000000402L});
	public static final BitSet FOLLOW_33_in_block239 = new BitSet(new long[]{0x0000043A00000400L});
	public static final BitSet FOLLOW_statlist_in_block241 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_block243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statswithsemi_in_statlist297 = new BitSet(new long[]{0x0000043200000402L});
	public static final BitSet FOLLOW_stat_in_statswithsemi306 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_statswithsemi308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_cond361 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_comparator_in_cond363 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_expr_in_cond365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_condstat422 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_cond_in_condstat425 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_condstat427 = new BitSet(new long[]{0x0000043200000400L});
	public static final BitSet FOLLOW_stat_in_condstat430 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_condstat440 = new BitSet(new long[]{0x0000043200000400L});
	public static final BitSet FOLLOW_stat_in_condstat443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_whilestat458 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whilestat460 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_cond_in_whilestat462 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_whilestat464 = new BitSet(new long[]{0x0000043200000400L});
	public static final BitSet FOLLOW_stat_in_whilestat466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_forstat523 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_forstat525 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_assignstat_in_forstat527 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat529 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_cond_in_forstat531 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat533 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_assignstat_in_forstat535 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_forstat537 = new BitSet(new long[]{0x0000043200000400L});
	public static final BitSet FOLLOW_stat_in_forstat539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat597 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_assignstat599 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_expr_in_assignstat601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr661 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_addOperator_in_expr664 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_expr_in_expr667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr3_in_expr2685 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_multOperator_in_expr2688 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_expr2_in_expr2691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr3709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_expr3713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr3717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_expr3721 = new BitSet(new long[]{0x0000000000110E00L});
	public static final BitSet FOLLOW_expr_in_expr3724 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_expr3726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr3731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_decl787 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl789 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl791 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TYPE_in_decl794 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier810 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_modifier812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_modifier820 = new BitSet(new long[]{0x0000000000000002L});
}
