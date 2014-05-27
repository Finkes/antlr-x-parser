// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g 2014-05-27 11:37:49
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BLOCK", "DECLARE", 
		"DIGIT", "FLOAT", "ID", "INT", "LETTER", "NUMBER", "OTHER", "STRING", 
		"TYPE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", 
		"':='", "';'", "'<'", "'='", "'>'", "'begin'", "'else'", "'end'", "'for'", 
		"'if'", "'print'", "'program'", "'read'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__17=17;
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
	public static final int ASSIGN=4;
	public static final int BLOCK=5;
	public static final int DECLARE=6;
	public static final int DIGIT=7;
	public static final int FLOAT=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int LETTER=11;
	public static final int NUMBER=12;
	public static final int OTHER=13;
	public static final int STRING=14;
	public static final int TYPE=15;
	public static final int WS=16;

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:1: program : 'program' ID ';' decllist block '.' EOF -> ^( 'program' ID ( decllist )* block ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token char_literal6=null;
		Token EOF7=null;
		ParserRuleReturnScope decllist4 =null;
		ParserRuleReturnScope block5 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object char_literal6_tree=null;
		Object EOF7_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_decllist=new RewriteRuleSubtreeStream(adaptor,"rule decllist");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:9: ( 'program' ID ';' decllist block '.' EOF -> ^( 'program' ID ( decllist )* block ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:17: 'program' ID ';' decllist block '.' EOF
			{
			string_literal1=(Token)match(input,36,FOLLOW_36_in_program65);  
			stream_36.add(string_literal1);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_program67);  
			stream_ID.add(ID2);

			char_literal3=(Token)match(input,26,FOLLOW_26_in_program69);  
			stream_26.add(char_literal3);

			pushFollow(FOLLOW_decllist_in_program71);
			decllist4=decllist();
			state._fsp--;

			stream_decllist.add(decllist4.getTree());
			pushFollow(FOLLOW_block_in_program73);
			block5=block();
			state._fsp--;

			stream_block.add(block5.getTree());
			char_literal6=(Token)match(input,22,FOLLOW_22_in_program75);  
			stream_22.add(char_literal6);

			EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_program77);  
			stream_EOF.add(EOF7);

			// AST REWRITE
			// elements: block, ID, 36, decllist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 15:58: -> ^( 'program' ID ( decllist )* block )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:61: ^( 'program' ID ( decllist )* block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:76: ( decllist )*
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:1: decllist : ( decl )* -> ( ^( DECLARE decl ) )* ;
	public final XParser.decllist_return decllist() throws RecognitionException {
		XParser.decllist_return retval = new XParser.decllist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decl8 =null;

		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:9: ( ( decl )* -> ( ^( DECLARE decl ) )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:17: ( decl )*
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:17: ( decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==35||LA1_0==37) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:17: decl
					{
					pushFollow(FOLLOW_decl_in_decllist103);
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
			// 16:53: -> ( ^( DECLARE decl ) )*
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:62: ( ^( DECLARE decl ) )*
				while ( stream_decl.hasNext() ) {
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:62: ^( DECLARE decl )
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:1: block : 'begin' statlist 'end' -> ^( BLOCK ( statlist )* ) ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token string_literal11=null;
		ParserRuleReturnScope statlist10 =null;

		Object string_literal9_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_statlist=new RewriteRuleSubtreeStream(adaptor,"rule statlist");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:6: ( 'begin' statlist 'end' -> ^( BLOCK ( statlist )* ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:17: 'begin' statlist 'end'
			{
			string_literal9=(Token)match(input,30,FOLLOW_30_in_block173);  
			stream_30.add(string_literal9);

			pushFollow(FOLLOW_statlist_in_block175);
			statlist10=statlist();
			state._fsp--;

			stream_statlist.add(statlist10.getTree());
			string_literal11=(Token)match(input,32,FOLLOW_32_in_block177);  
			stream_32.add(string_literal11);

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
			// 17:40: -> ^( BLOCK ( statlist )* )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:43: ^( BLOCK ( statlist )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:51: ( statlist )*
				while ( stream_statlist.hasNext() ) {
					adaptor.addChild(root_1, stream_statlist.nextTree());
				}
				stream_statlist.reset();

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:1: statlist : ( statswithsemi )* ;
	public final XParser.statlist_return statlist() throws RecognitionException {
		XParser.statlist_return retval = new XParser.statlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statswithsemi12 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:9: ( ( statswithsemi )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:17: ( statswithsemi )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:17: ( statswithsemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||LA2_0==30||(LA2_0 >= 33 && LA2_0 <= 34)||LA2_0==39) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:17: statswithsemi
					{
					pushFollow(FOLLOW_statswithsemi_in_statlist198);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:19:1: statswithsemi : stat ';' !;
	public final XParser.statswithsemi_return statswithsemi() throws RecognitionException {
		XParser.statswithsemi_return retval = new XParser.statswithsemi_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal14=null;
		ParserRuleReturnScope stat13 =null;

		Object char_literal14_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:19:14: ( stat ';' !)
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:19:17: stat ';' !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_stat_in_statswithsemi206);
			stat13=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat13.getTree());

			char_literal14=(Token)match(input,26,FOLLOW_26_in_statswithsemi208); 
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:1: stat : ( assignstat | condstat | whilestat | forstat | block );
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:5: ( assignstat | condstat | whilestat | forstat | block )
			int alt3=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case 34:
				{
				alt3=2;
				}
				break;
			case 39:
				{
				alt3=3;
				}
				break;
			case 33:
				{
				alt3=4;
				}
				break;
			case 30:
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:17: assignstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignstat_in_stat226);
					assignstat15=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat15.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:30: condstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condstat_in_stat230);
					condstat16=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat16.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:41: whilestat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whilestat_in_stat234);
					whilestat17=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat17.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:53: forstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forstat_in_stat238);
					forstat18=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat18.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:63: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat242);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:21:1: cond : expr ( '<' | '>' | '=' ) expr ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set21=null;
		ParserRuleReturnScope expr20 =null;
		ParserRuleReturnScope expr22 =null;

		Object set21_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:21:5: ( expr ( '<' | '>' | '=' ) expr )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:21:17: expr ( '<' | '>' | '=' ) expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_cond259);
			expr20=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr20.getTree());

			set21=input.LT(1);
			if ( (input.LA(1) >= 27 && input.LA(1) <= 29) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set21));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_expr_in_cond269);
			expr22=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr22.getTree());

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:1: condstat : 'if' cond 'then' stat ( 'else' stat )? ;
	public final XParser.condstat_return condstat() throws RecognitionException {
		XParser.condstat_return retval = new XParser.condstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token string_literal25=null;
		Token string_literal27=null;
		ParserRuleReturnScope cond24 =null;
		ParserRuleReturnScope stat26 =null;
		ParserRuleReturnScope stat28 =null;

		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		Object string_literal27_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:9: ( 'if' cond 'then' stat ( 'else' stat )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:17: 'if' cond 'then' stat ( 'else' stat )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal23=(Token)match(input,34,FOLLOW_34_in_condstat281); 
			string_literal23_tree = (Object)adaptor.create(string_literal23);
			adaptor.addChild(root_0, string_literal23_tree);

			pushFollow(FOLLOW_cond_in_condstat283);
			cond24=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond24.getTree());

			string_literal25=(Token)match(input,38,FOLLOW_38_in_condstat285); 
			string_literal25_tree = (Object)adaptor.create(string_literal25);
			adaptor.addChild(root_0, string_literal25_tree);

			pushFollow(FOLLOW_stat_in_condstat287);
			stat26=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat26.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:39: ( 'else' stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==31) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:40: 'else' stat
					{
					string_literal27=(Token)match(input,31,FOLLOW_31_in_condstat290); 
					string_literal27_tree = (Object)adaptor.create(string_literal27);
					adaptor.addChild(root_0, string_literal27_tree);

					pushFollow(FOLLOW_stat_in_condstat292);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:1: whilestat : 'while' '(' cond ')' stat -> ^( 'while' cond stat ) ;
	public final XParser.whilestat_return whilestat() throws RecognitionException {
		XParser.whilestat_return retval = new XParser.whilestat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		ParserRuleReturnScope cond31 =null;
		ParserRuleReturnScope stat33 =null;

		Object string_literal29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:10: ( 'while' '(' cond ')' stat -> ^( 'while' cond stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:17: 'while' '(' cond ')' stat
			{
			string_literal29=(Token)match(input,39,FOLLOW_39_in_whilestat306);  
			stream_39.add(string_literal29);

			char_literal30=(Token)match(input,17,FOLLOW_17_in_whilestat308);  
			stream_17.add(char_literal30);

			pushFollow(FOLLOW_cond_in_whilestat310);
			cond31=cond();
			state._fsp--;

			stream_cond.add(cond31.getTree());
			char_literal32=(Token)match(input,18,FOLLOW_18_in_whilestat312);  
			stream_18.add(char_literal32);

			pushFollow(FOLLOW_stat_in_whilestat314);
			stat33=stat();
			state._fsp--;

			stream_stat.add(stat33.getTree());
			// AST REWRITE
			// elements: cond, 39, stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 23:43: -> ^( 'while' cond stat )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:46: ^( 'while' cond stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:1: forstat : 'for' '(' assignstat ';' cond ';' assignstat ')' stat -> ^( 'for' assignstat cond assignstat stat ) ;
	public final XParser.forstat_return forstat() throws RecognitionException {
		XParser.forstat_return retval = new XParser.forstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope assignstat36 =null;
		ParserRuleReturnScope cond38 =null;
		ParserRuleReturnScope assignstat40 =null;
		ParserRuleReturnScope stat42 =null;

		Object string_literal34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		Object char_literal41_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_assignstat=new RewriteRuleSubtreeStream(adaptor,"rule assignstat");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:8: ( 'for' '(' assignstat ';' cond ';' assignstat ')' stat -> ^( 'for' assignstat cond assignstat stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:17: 'for' '(' assignstat ';' cond ';' assignstat ')' stat
			{
			string_literal34=(Token)match(input,33,FOLLOW_33_in_forstat337);  
			stream_33.add(string_literal34);

			char_literal35=(Token)match(input,17,FOLLOW_17_in_forstat339);  
			stream_17.add(char_literal35);

			pushFollow(FOLLOW_assignstat_in_forstat341);
			assignstat36=assignstat();
			state._fsp--;

			stream_assignstat.add(assignstat36.getTree());
			char_literal37=(Token)match(input,26,FOLLOW_26_in_forstat343);  
			stream_26.add(char_literal37);

			pushFollow(FOLLOW_cond_in_forstat345);
			cond38=cond();
			state._fsp--;

			stream_cond.add(cond38.getTree());
			char_literal39=(Token)match(input,26,FOLLOW_26_in_forstat347);  
			stream_26.add(char_literal39);

			pushFollow(FOLLOW_assignstat_in_forstat349);
			assignstat40=assignstat();
			state._fsp--;

			stream_assignstat.add(assignstat40.getTree());
			char_literal41=(Token)match(input,18,FOLLOW_18_in_forstat351);  
			stream_18.add(char_literal41);

			pushFollow(FOLLOW_stat_in_forstat353);
			stat42=stat();
			state._fsp--;

			stream_stat.add(stat42.getTree());
			// AST REWRITE
			// elements: stat, 33, assignstat, assignstat, cond
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 24:71: -> ^( 'for' assignstat cond assignstat stat )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:74: ^( 'for' assignstat cond assignstat stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:1: assignstat : ID ':=' expr -> ^( ASSIGN ID expr ) ;
	public final XParser.assignstat_return assignstat() throws RecognitionException {
		XParser.assignstat_return retval = new XParser.assignstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID43=null;
		Token string_literal44=null;
		ParserRuleReturnScope expr45 =null;

		Object ID43_tree=null;
		Object string_literal44_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:11: ( ID ':=' expr -> ^( ASSIGN ID expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:17: ID ':=' expr
			{
			ID43=(Token)match(input,ID,FOLLOW_ID_in_assignstat377);  
			stream_ID.add(ID43);

			string_literal44=(Token)match(input,25,FOLLOW_25_in_assignstat379);  
			stream_25.add(string_literal44);

			pushFollow(FOLLOW_expr_in_assignstat381);
			expr45=expr();
			state._fsp--;

			stream_expr.add(expr45.getTree());
			// AST REWRITE
			// elements: expr, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:30: -> ^( ASSIGN ID expr )
			{
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:33: ^( ASSIGN ID expr )
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:1: expr : expr2 ( addOperator ^ expr )? ;
	public final XParser.expr_return expr() throws RecognitionException {
		XParser.expr_return retval = new XParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr246 =null;
		ParserRuleReturnScope addOperator47 =null;
		ParserRuleReturnScope expr48 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:5: ( expr2 ( addOperator ^ expr )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:17: expr2 ( addOperator ^ expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr407);
			expr246=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr246.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:23: ( addOperator ^ expr )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= 20 && LA5_0 <= 21)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:24: addOperator ^ expr
					{
					pushFollow(FOLLOW_addOperator_in_expr410);
					addOperator47=addOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(addOperator47.getTree(), root_0);
					pushFollow(FOLLOW_expr_in_expr413);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:1: expr2 : expr3 ( multOperator ^ expr2 )? ;
	public final XParser.expr2_return expr2() throws RecognitionException {
		XParser.expr2_return retval = new XParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr349 =null;
		ParserRuleReturnScope multOperator50 =null;
		ParserRuleReturnScope expr251 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:6: ( expr3 ( multOperator ^ expr2 )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:17: expr3 ( multOperator ^ expr2 )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr3_in_expr2430);
			expr349=expr3();
			state._fsp--;

			adaptor.addChild(root_0, expr349.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:23: ( multOperator ^ expr2 )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==19||LA6_0==23) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:24: multOperator ^ expr2
					{
					pushFollow(FOLLOW_multOperator_in_expr2433);
					multOperator50=multOperator();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(multOperator50.getTree(), root_0);
					pushFollow(FOLLOW_expr2_in_expr2436);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:1: expr3 : ( INT | FLOAT | ID | '(' ! expr ')' !| STRING );
	public final XParser.expr3_return expr3() throws RecognitionException {
		XParser.expr3_return retval = new XParser.expr3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT52=null;
		Token FLOAT53=null;
		Token ID54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		Token STRING58=null;
		ParserRuleReturnScope expr56 =null;

		Object INT52_tree=null;
		Object FLOAT53_tree=null;
		Object ID54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		Object STRING58_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:6: ( INT | FLOAT | ID | '(' ! expr ')' !| STRING )
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
			case 17:
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:17: INT
					{
					root_0 = (Object)adaptor.nil();


					INT52=(Token)match(input,INT,FOLLOW_INT_in_expr3453); 
					INT52_tree = (Object)adaptor.create(INT52);
					adaptor.addChild(root_0, INT52_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:23: FLOAT
					{
					root_0 = (Object)adaptor.nil();


					FLOAT53=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_expr3457); 
					FLOAT53_tree = (Object)adaptor.create(FLOAT53);
					adaptor.addChild(root_0, FLOAT53_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:31: ID
					{
					root_0 = (Object)adaptor.nil();


					ID54=(Token)match(input,ID,FOLLOW_ID_in_expr3461); 
					ID54_tree = (Object)adaptor.create(ID54);
					adaptor.addChild(root_0, ID54_tree);

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:36: '(' ! expr ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal55=(Token)match(input,17,FOLLOW_17_in_expr3465); 
					pushFollow(FOLLOW_expr_in_expr3468);
					expr56=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr56.getTree());

					char_literal57=(Token)match(input,18,FOLLOW_18_in_expr3470); 
					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:53: STRING
					{
					root_0 = (Object)adaptor.nil();


					STRING58=(Token)match(input,STRING,FOLLOW_STRING_in_expr3475); 
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:30:1: addOperator : ( '+' | '-' );
	public final XParser.addOperator_return addOperator() throws RecognitionException {
		XParser.addOperator_return retval = new XParser.addOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set59=null;

		Object set59_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:30:12: ( '+' | '-' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set59=input.LT(1);
			if ( (input.LA(1) >= 20 && input.LA(1) <= 21) ) {
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:31:1: multOperator : ( '*' | '/' );
	public final XParser.multOperator_return multOperator() throws RecognitionException {
		XParser.multOperator_return retval = new XParser.multOperator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set60=null;

		Object set60_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:31:13: ( '*' | '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			root_0 = (Object)adaptor.nil();


			set60=input.LT(1);
			if ( input.LA(1)==19||input.LA(1)==23 ) {
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


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:33:1: decl : modifier ID ':' ! TYPE ';' !;
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID62=null;
		Token char_literal63=null;
		Token TYPE64=null;
		Token char_literal65=null;
		ParserRuleReturnScope modifier61 =null;

		Object ID62_tree=null;
		Object char_literal63_tree=null;
		Object TYPE64_tree=null;
		Object char_literal65_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:33:5: ( modifier ID ':' ! TYPE ';' !)
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:33:17: modifier ID ':' ! TYPE ';' !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_modifier_in_decl517);
			modifier61=modifier();
			state._fsp--;

			adaptor.addChild(root_0, modifier61.getTree());

			ID62=(Token)match(input,ID,FOLLOW_ID_in_decl519); 
			ID62_tree = (Object)adaptor.create(ID62);
			adaptor.addChild(root_0, ID62_tree);

			char_literal63=(Token)match(input,24,FOLLOW_24_in_decl521); 
			TYPE64=(Token)match(input,TYPE,FOLLOW_TYPE_in_decl524); 
			TYPE64_tree = (Object)adaptor.create(TYPE64);
			adaptor.addChild(root_0, TYPE64_tree);

			char_literal65=(Token)match(input,26,FOLLOW_26_in_decl526); 
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:1: modifier : ( 'read' 'print' | 'read' | 'print' )? ;
	public final XParser.modifier_return modifier() throws RecognitionException {
		XParser.modifier_return retval = new XParser.modifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal66=null;
		Token string_literal67=null;
		Token string_literal68=null;
		Token string_literal69=null;

		Object string_literal66_tree=null;
		Object string_literal67_tree=null;
		Object string_literal68_tree=null;
		Object string_literal69_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:9: ( ( 'read' 'print' | 'read' | 'print' )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:17: ( 'read' 'print' | 'read' | 'print' )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:17: ( 'read' 'print' | 'read' | 'print' )?
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==37) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==35) ) {
					alt8=1;
				}
				else if ( (LA8_1==ID) ) {
					alt8=2;
				}
			}
			else if ( (LA8_0==35) ) {
				alt8=3;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:18: 'read' 'print'
					{
					string_literal66=(Token)match(input,37,FOLLOW_37_in_modifier540); 
					string_literal66_tree = (Object)adaptor.create(string_literal66);
					adaptor.addChild(root_0, string_literal66_tree);

					string_literal67=(Token)match(input,35,FOLLOW_35_in_modifier542); 
					string_literal67_tree = (Object)adaptor.create(string_literal67);
					adaptor.addChild(root_0, string_literal67_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:35: 'read'
					{
					string_literal68=(Token)match(input,37,FOLLOW_37_in_modifier546); 
					string_literal68_tree = (Object)adaptor.create(string_literal68);
					adaptor.addChild(root_0, string_literal68_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:34:44: 'print'
					{
					string_literal69=(Token)match(input,35,FOLLOW_35_in_modifier550); 
					string_literal69_tree = (Object)adaptor.create(string_literal69);
					adaptor.addChild(root_0, string_literal69_tree);

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



	public static final BitSet FOLLOW_36_in_program65 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program67 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_program69 = new BitSet(new long[]{0x0000002840000200L});
	public static final BitSet FOLLOW_decllist_in_program71 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_block_in_program73 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_program75 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decllist103 = new BitSet(new long[]{0x0000002800000202L});
	public static final BitSet FOLLOW_30_in_block173 = new BitSet(new long[]{0x0000008740000200L});
	public static final BitSet FOLLOW_statlist_in_block175 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_block177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statswithsemi_in_statlist198 = new BitSet(new long[]{0x0000008640000202L});
	public static final BitSet FOLLOW_stat_in_statswithsemi206 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statswithsemi208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_cond259 = new BitSet(new long[]{0x0000000038000000L});
	public static final BitSet FOLLOW_set_in_cond261 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_expr_in_cond269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_condstat281 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_cond_in_condstat283 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_condstat285 = new BitSet(new long[]{0x0000008640000200L});
	public static final BitSet FOLLOW_stat_in_condstat287 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_condstat290 = new BitSet(new long[]{0x0000008640000200L});
	public static final BitSet FOLLOW_stat_in_condstat292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_whilestat306 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_whilestat308 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_cond_in_whilestat310 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whilestat312 = new BitSet(new long[]{0x0000008640000200L});
	public static final BitSet FOLLOW_stat_in_whilestat314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_forstat337 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_forstat339 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat341 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_forstat343 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_cond_in_forstat345 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_forstat347 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat349 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_forstat351 = new BitSet(new long[]{0x0000008640000200L});
	public static final BitSet FOLLOW_stat_in_forstat353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat377 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_assignstat379 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_expr_in_assignstat381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr407 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_addOperator_in_expr410 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_expr_in_expr413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr3_in_expr2430 = new BitSet(new long[]{0x0000000000880002L});
	public static final BitSet FOLLOW_multOperator_in_expr2433 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_expr2_in_expr2436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_expr3457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr3461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr3465 = new BitSet(new long[]{0x0000000000024700L});
	public static final BitSet FOLLOW_expr_in_expr3468 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_expr3470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr3475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_decl517 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl519 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_decl521 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_TYPE_in_decl524 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_decl526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_modifier540 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_modifier542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_modifier546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_modifier550 = new BitSet(new long[]{0x0000000000000002L});
}
