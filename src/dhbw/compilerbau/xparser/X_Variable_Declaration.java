// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g 2014-06-10 12:00:34
package dhbw.compilerbau.xparser; import java.util.Hashtable; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class X_Variable_Declaration extends TreeParser {
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


	public X_Variable_Declaration(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public X_Variable_Declaration(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return X_Variable_Declaration.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g"; }

	 Hashtable variables = new Hashtable(); 

	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:14:1: program : ^( 'program' ID ( decllist )* block ) ;
	public final X_Variable_Declaration.program_return program() throws RecognitionException {
		X_Variable_Declaration.program_return retval = new X_Variable_Declaration.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal1=null;
		CommonTree ID2=null;
		TreeRuleReturnScope decllist3 =null;
		TreeRuleReturnScope block4 =null;

		CommonTree string_literal1_tree=null;
		CommonTree ID2_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:14:9: ( ^( 'program' ID ( decllist )* block ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:14:17: ^( 'program' ID ( decllist )* block )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal1=(CommonTree)match(input,37,FOLLOW_37_in_program72); 
			string_literal1_tree = (CommonTree)adaptor.dupNode(string_literal1);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_program74); 
			ID2_tree = (CommonTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:14:32: ( decllist )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECLARE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:14:32: decllist
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_decllist_in_program76);
					decllist3=decllist();
					state._fsp--;

					adaptor.addChild(root_1, decllist3.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_block_in_program79);
			block4=block();
			state._fsp--;

			adaptor.addChild(root_1, block4.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class decllist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:16:1: decllist : ^( DECLARE decl ) ;
	public final X_Variable_Declaration.decllist_return decllist() throws RecognitionException {
		X_Variable_Declaration.decllist_return retval = new X_Variable_Declaration.decllist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLARE5=null;
		TreeRuleReturnScope decl6 =null;

		CommonTree DECLARE5_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:16:9: ( ^( DECLARE decl ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:16:17: ^( DECLARE decl )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLARE5=(CommonTree)match(input,DECLARE,FOLLOW_DECLARE_in_decllist94); 
			DECLARE5_tree = (CommonTree)adaptor.dupNode(DECLARE5);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLARE5_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decl_in_decllist96);
			decl6=decl();
			state._fsp--;

			adaptor.addChild(root_1, decl6.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class block_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:18:1: block : ^( BLOCK statlist ) ;
	public final X_Variable_Declaration.block_return block() throws RecognitionException {
		X_Variable_Declaration.block_return retval = new X_Variable_Declaration.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BLOCK7=null;
		TreeRuleReturnScope statlist8 =null;

		CommonTree BLOCK7_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:18:6: ( ^( BLOCK statlist ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:18:17: ^( BLOCK statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			BLOCK7=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_block139); 
			BLOCK7_tree = (CommonTree)adaptor.dupNode(BLOCK7);


			root_1 = (CommonTree)adaptor.becomeRoot(BLOCK7_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				_last = (CommonTree)input.LT(1);
				pushFollow(FOLLOW_statlist_in_block141);
				statlist8=statlist();
				state._fsp--;

				adaptor.addChild(root_1, statlist8.getTree());

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statlist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:20:1: statlist : ( statswithsemi )* ;
	public final X_Variable_Declaration.statlist_return statlist() throws RecognitionException {
		X_Variable_Declaration.statlist_return retval = new X_Variable_Declaration.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope statswithsemi9 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:20:9: ( ( statswithsemi )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:20:17: ( statswithsemi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:20:17: ( statswithsemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ASSIGN && LA2_0 <= BLOCK)||(LA2_0 >= 34 && LA2_0 <= 35)||LA2_0==40) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:20:17: statswithsemi
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statswithsemi_in_statlist171);
					statswithsemi9=statswithsemi();
					state._fsp--;

					adaptor.addChild(root_0, statswithsemi9.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class statswithsemi_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statswithsemi"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:22:1: statswithsemi : stat ;
	public final X_Variable_Declaration.statswithsemi_return statswithsemi() throws RecognitionException {
		X_Variable_Declaration.statswithsemi_return retval = new X_Variable_Declaration.statswithsemi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope stat10 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:22:14: ( stat )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:22:17: stat
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_statswithsemi180);
			stat10=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat10.getTree());

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statswithsemi"


	public static class stat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:1: stat : ( assignstat | condstat | whilestat | forstat | block );
	public final X_Variable_Declaration.stat_return stat() throws RecognitionException {
		X_Variable_Declaration.stat_return retval = new X_Variable_Declaration.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignstat11 =null;
		TreeRuleReturnScope condstat12 =null;
		TreeRuleReturnScope whilestat13 =null;
		TreeRuleReturnScope forstat14 =null;
		TreeRuleReturnScope block15 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:5: ( assignstat | condstat | whilestat | forstat | block )
			int alt3=5;
			switch ( input.LA(1) ) {
			case ASSIGN:
				{
				alt3=1;
				}
				break;
			case 35:
				{
				alt3=2;
				}
				break;
			case 40:
				{
				alt3=3;
				}
				break;
			case 34:
				{
				alt3=4;
				}
				break;
			case BLOCK:
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:17: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat198);
					assignstat11=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat11.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:30: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat202);
					condstat12=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat12.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:41: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat206);
					whilestat13=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat13.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:53: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat210);
					forstat14=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat14.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:24:63: block
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_block_in_stat214);
					block15=block();
					state._fsp--;

					adaptor.addChild(root_0, block15.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class cond_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:26:1: cond : ^( comparator expr expr ) ;
	public final X_Variable_Declaration.cond_return cond() throws RecognitionException {
		X_Variable_Declaration.cond_return retval = new X_Variable_Declaration.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope comparator16 =null;
		TreeRuleReturnScope expr17 =null;
		TreeRuleReturnScope expr18 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:26:5: ( ^( comparator expr expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:26:17: ^( comparator expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_comparator_in_cond233);
			comparator16=comparator();
			state._fsp--;

			root_1 = (CommonTree)adaptor.becomeRoot(comparator16.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond235);
			expr17=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr17.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond237);
			expr18=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr18.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class condstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:28:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final X_Variable_Declaration.condstat_return condstat() throws RecognitionException {
		X_Variable_Declaration.condstat_return retval = new X_Variable_Declaration.condstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal19=null;
		TreeRuleReturnScope cond20 =null;
		TreeRuleReturnScope stat21 =null;
		TreeRuleReturnScope stat22 =null;

		CommonTree string_literal19_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:28:9: ( ^( 'if' cond stat ( stat )? ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:28:17: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal19=(CommonTree)match(input,35,FOLLOW_35_in_condstat268); 
			string_literal19_tree = (CommonTree)adaptor.dupNode(string_literal19);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal19_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat270);
			cond20=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond20.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat272);
			stat21=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat21.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:28:34: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ASSIGN && LA4_0 <= BLOCK)||(LA4_0 >= 34 && LA4_0 <= 35)||LA4_0==40) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:28:34: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat274);
					stat22=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat22.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class whilestat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:30:1: whilestat : ^( 'while' cond stat ) ;
	public final X_Variable_Declaration.whilestat_return whilestat() throws RecognitionException {
		X_Variable_Declaration.whilestat_return retval = new X_Variable_Declaration.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal23=null;
		TreeRuleReturnScope cond24 =null;
		TreeRuleReturnScope stat25 =null;

		CommonTree string_literal23_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:30:10: ( ^( 'while' cond stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:30:17: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal23=(CommonTree)match(input,40,FOLLOW_40_in_whilestat290); 
			string_literal23_tree = (CommonTree)adaptor.dupNode(string_literal23);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal23_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat292);
			cond24=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond24.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat294);
			stat25=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat25.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:32:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final X_Variable_Declaration.forstat_return forstat() throws RecognitionException {
		X_Variable_Declaration.forstat_return retval = new X_Variable_Declaration.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal26=null;
		TreeRuleReturnScope assignstat27 =null;
		TreeRuleReturnScope cond28 =null;
		TreeRuleReturnScope assignstat29 =null;
		TreeRuleReturnScope stat30 =null;

		CommonTree string_literal26_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:32:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:32:17: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal26=(CommonTree)match(input,34,FOLLOW_34_in_forstat326); 
			string_literal26_tree = (CommonTree)adaptor.dupNode(string_literal26);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat328);
			assignstat27=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat27.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat330);
			cond28=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond28.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat332);
			assignstat29=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat29.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat334);
			stat30=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat30.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class assignstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:34:1: assignstat : ^( ASSIGN ID expr ) ;
	public final X_Variable_Declaration.assignstat_return assignstat() throws RecognitionException {
		X_Variable_Declaration.assignstat_return retval = new X_Variable_Declaration.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ASSIGN31=null;
		CommonTree ID32=null;
		TreeRuleReturnScope expr33 =null;

		CommonTree ASSIGN31_tree=null;
		CommonTree ID32_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:34:11: ( ^( ASSIGN ID expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:34:17: ^( ASSIGN ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ASSIGN31=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignstat363); 
			ASSIGN31_tree = (CommonTree)adaptor.dupNode(ASSIGN31);


			root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID32=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat365); 
			ID32_tree = (CommonTree)adaptor.dupNode(ID32);


			adaptor.addChild(root_1, ID32_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat367);
			expr33=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr33.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 if(!variables.containsKey((ID32!=null?ID32.getText():null))) { System.out.println((ID32!=null?ID32.getText():null) + " is not declared!"); } 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class expr_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:1: expr : ( term | ( ^( operator term term ) ) );
	public final X_Variable_Declaration.expr_return expr() throws RecognitionException {
		X_Variable_Declaration.expr_return retval = new X_Variable_Declaration.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope term34 =null;
		TreeRuleReturnScope operator35 =null;
		TreeRuleReturnScope term36 =null;
		TreeRuleReturnScope term37 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:5: ( term | ( ^( operator term term ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= FLOAT && LA5_0 <= INT)||LA5_0==STRING) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= 20 && LA5_0 <= 22)||LA5_0==24) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:17: term
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr403);
					term34=term();
					state._fsp--;

					adaptor.addChild(root_0, term34.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:24: ( ^( operator term term ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:24: ( ^( operator term term ) )
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:36:25: ^( operator term term )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operator_in_expr409);
					operator35=operator();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(operator35.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr411);
					term36=term();
					state._fsp--;

					adaptor.addChild(root_1, term36.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr413);
					term37=term();
					state._fsp--;

					adaptor.addChild(root_1, term37.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class term_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:1: term : ( INT | FLOAT | ID | STRING );
	public final X_Variable_Declaration.term_return term() throws RecognitionException {
		X_Variable_Declaration.term_return retval = new X_Variable_Declaration.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INT38=null;
		CommonTree FLOAT39=null;
		CommonTree ID40=null;
		CommonTree STRING41=null;

		CommonTree INT38_tree=null;
		CommonTree FLOAT39_tree=null;
		CommonTree ID40_tree=null;
		CommonTree STRING41_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:5: ( INT | FLOAT | ID | STRING )
			int alt6=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case FLOAT:
				{
				alt6=2;
				}
				break;
			case ID:
				{
				alt6=3;
				}
				break;
			case STRING:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:17: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INT38=(CommonTree)match(input,INT,FOLLOW_INT_in_term432); 
					INT38_tree = (CommonTree)adaptor.dupNode(INT38);


					adaptor.addChild(root_0, INT38_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:23: FLOAT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOAT39=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_term436); 
					FLOAT39_tree = (CommonTree)adaptor.dupNode(FLOAT39);


					adaptor.addChild(root_0, FLOAT39_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:31: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_term440); 
					ID40_tree = (CommonTree)adaptor.dupNode(ID40);


					adaptor.addChild(root_0, ID40_tree);

					 if(!variables.containsKey((ID40!=null?ID40.getText():null))) { System.out.println((ID40!=null?ID40.getText():null) + " is not declared!"); } 
					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:38:133: STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRING41=(CommonTree)match(input,STRING,FOLLOW_STRING_in_term446); 
					STRING41_tree = (CommonTree)adaptor.dupNode(STRING41);


					adaptor.addChild(root_0, STRING41_tree);

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class operator_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:40:1: operator : ( '+' | '-' | '*' | '/' );
	public final X_Variable_Declaration.operator_return operator() throws RecognitionException {
		X_Variable_Declaration.operator_return retval = new X_Variable_Declaration.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set42=null;

		CommonTree set42_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:40:9: ( '+' | '-' | '*' | '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set42=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 20 && input.LA(1) <= 22)||input.LA(1)==24 ) {
				input.consume();
				set42_tree = (CommonTree)adaptor.dupNode(set42);


				adaptor.addChild(root_0, set42_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operator"


	public static class comparator_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comparator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:42:1: comparator : ( '<' | '>' | '=' );
	public final X_Variable_Declaration.comparator_return comparator() throws RecognitionException {
		X_Variable_Declaration.comparator_return retval = new X_Variable_Declaration.comparator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set43=null;

		CommonTree set43_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:42:11: ( '<' | '>' | '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set43=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 28 && input.LA(1) <= 30) ) {
				input.consume();
				set43_tree = (CommonTree)adaptor.dupNode(set43);


				adaptor.addChild(root_0, set43_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparator"


	public static class decl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:44:1: decl : modifier ID TYPE ;
	public final X_Variable_Declaration.decl_return decl() throws RecognitionException {
		X_Variable_Declaration.decl_return retval = new X_Variable_Declaration.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID45=null;
		CommonTree TYPE46=null;
		TreeRuleReturnScope modifier44 =null;

		CommonTree ID45_tree=null;
		CommonTree TYPE46_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:44:5: ( modifier ID TYPE )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:44:17: modifier ID TYPE
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_modifier_in_decl503);
			modifier44=modifier();
			state._fsp--;

			adaptor.addChild(root_0, modifier44.getTree());

			_last = (CommonTree)input.LT(1);
			ID45=(CommonTree)match(input,ID,FOLLOW_ID_in_decl505); 
			ID45_tree = (CommonTree)adaptor.dupNode(ID45);


			adaptor.addChild(root_0, ID45_tree);

			_last = (CommonTree)input.LT(1);
			TYPE46=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_decl508); 
			TYPE46_tree = (CommonTree)adaptor.dupNode(TYPE46);


			adaptor.addChild(root_0, TYPE46_tree);

			 variables.put((ID45!=null?ID45.getText():null), (TYPE46!=null?TYPE46.getText():null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class modifier_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:1: modifier : ( 'read' 'print' | 'read' | 'print' )? ;
	public final X_Variable_Declaration.modifier_return modifier() throws RecognitionException {
		X_Variable_Declaration.modifier_return retval = new X_Variable_Declaration.modifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal47=null;
		CommonTree string_literal48=null;
		CommonTree string_literal49=null;
		CommonTree string_literal50=null;

		CommonTree string_literal47_tree=null;
		CommonTree string_literal48_tree=null;
		CommonTree string_literal49_tree=null;
		CommonTree string_literal50_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:9: ( ( 'read' 'print' | 'read' | 'print' )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:17: ( 'read' 'print' | 'read' | 'print' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:17: ( 'read' 'print' | 'read' | 'print' )?
			int alt7=4;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==38) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==36) ) {
					alt7=1;
				}
				else if ( (LA7_1==ID) ) {
					alt7=2;
				}
			}
			else if ( (LA7_0==36) ) {
				alt7=3;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:18: 'read' 'print'
					{
					_last = (CommonTree)input.LT(1);
					string_literal47=(CommonTree)match(input,38,FOLLOW_38_in_modifier524); 
					string_literal47_tree = (CommonTree)adaptor.dupNode(string_literal47);


					adaptor.addChild(root_0, string_literal47_tree);

					_last = (CommonTree)input.LT(1);
					string_literal48=(CommonTree)match(input,36,FOLLOW_36_in_modifier526); 
					string_literal48_tree = (CommonTree)adaptor.dupNode(string_literal48);


					adaptor.addChild(root_0, string_literal48_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:35: 'read'
					{
					_last = (CommonTree)input.LT(1);
					string_literal49=(CommonTree)match(input,38,FOLLOW_38_in_modifier530); 
					string_literal49_tree = (CommonTree)adaptor.dupNode(string_literal49);


					adaptor.addChild(root_0, string_literal49_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Variable_Declaration.g:46:44: 'print'
					{
					_last = (CommonTree)input.LT(1);
					string_literal50=(CommonTree)match(input,36,FOLLOW_36_in_modifier534); 
					string_literal50_tree = (CommonTree)adaptor.dupNode(string_literal50);


					adaptor.addChild(root_0, string_literal50_tree);

					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"

	// Delegated rules



	public static final BitSet FOLLOW_37_in_program72 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program74 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_decllist_in_program76 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_block_in_program79 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARE_in_decllist94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist96 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statlist_in_block141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statswithsemi_in_statlist171 = new BitSet(new long[]{0x0000010C00000032L});
	public static final BitSet FOLLOW_stat_in_statswithsemi180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparator_in_cond233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond235 = new BitSet(new long[]{0x0000000001708E00L});
	public static final BitSet FOLLOW_expr_in_cond237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_condstat268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat270 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_condstat272 = new BitSet(new long[]{0x0000010C00000038L});
	public static final BitSet FOLLOW_stat_in_condstat274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_40_in_whilestat290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat292 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_whilestat294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_forstat326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat328 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_cond_in_forstat330 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_assignstat_in_forstat332 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_forstat334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignstat363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat365 = new BitSet(new long[]{0x0000000001708E00L});
	public static final BitSet FOLLOW_expr_in_assignstat367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_term_in_expr403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expr409 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_expr411 = new BitSet(new long[]{0x0000000000008E00L});
	public static final BitSet FOLLOW_term_in_expr413 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_term432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_term436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_term440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_term446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_decl503 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl505 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_TYPE_in_decl508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_modifier524 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_modifier526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_modifier530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_modifier534 = new BitSet(new long[]{0x0000000000000002L});
}
