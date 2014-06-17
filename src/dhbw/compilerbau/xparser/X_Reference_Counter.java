// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g 2014-06-17 10:02:39
package dhbw.compilerbau.xparser;
         import java.util.Hashtable;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class X_Reference_Counter extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public X_Reference_Counter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public X_Reference_Counter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return X_Reference_Counter.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g"; }

	 public int num_assignments = 0; 
	           public Hashtable references = new Hashtable();
	          

	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:18:1: program : ^( 'program' ID ( decllist )* block ) ;
	public final X_Reference_Counter.program_return program() throws RecognitionException {
		X_Reference_Counter.program_return retval = new X_Reference_Counter.program_return();
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:18:9: ( ^( 'program' ID ( decllist )* block ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:18:17: ^( 'program' ID ( decllist )* block )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal1=(CommonTree)match(input,39,FOLLOW_39_in_program81); 
			string_literal1_tree = (CommonTree)adaptor.dupNode(string_literal1);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_program83); 
			ID2_tree = (CommonTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:18:32: ( decllist )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECLARE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:18:32: decllist
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_decllist_in_program85);
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
			pushFollow(FOLLOW_block_in_program88);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:20:1: decllist : ^( DECLARE decl ) ;
	public final X_Reference_Counter.decllist_return decllist() throws RecognitionException {
		X_Reference_Counter.decllist_return retval = new X_Reference_Counter.decllist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLARE5=null;
		TreeRuleReturnScope decl6 =null;

		CommonTree DECLARE5_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:20:9: ( ^( DECLARE decl ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:20:17: ^( DECLARE decl )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLARE5=(CommonTree)match(input,DECLARE,FOLLOW_DECLARE_in_decllist103); 
			DECLARE5_tree = (CommonTree)adaptor.dupNode(DECLARE5);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLARE5_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decl_in_decllist105);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:22:1: block : ^( BLOCK statlist ) ;
	public final X_Reference_Counter.block_return block() throws RecognitionException {
		X_Reference_Counter.block_return retval = new X_Reference_Counter.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BLOCK7=null;
		TreeRuleReturnScope statlist8 =null;

		CommonTree BLOCK7_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:22:6: ( ^( BLOCK statlist ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:22:17: ^( BLOCK statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			BLOCK7=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_block148); 
			BLOCK7_tree = (CommonTree)adaptor.dupNode(BLOCK7);


			root_1 = (CommonTree)adaptor.becomeRoot(BLOCK7_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				_last = (CommonTree)input.LT(1);
				pushFollow(FOLLOW_statlist_in_block150);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:24:1: statlist : ( statswithsemi )* ;
	public final X_Reference_Counter.statlist_return statlist() throws RecognitionException {
		X_Reference_Counter.statlist_return retval = new X_Reference_Counter.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope statswithsemi9 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:24:9: ( ( statswithsemi )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:24:17: ( statswithsemi )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:24:17: ( statswithsemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ASSIGN && LA2_0 <= BLOCK)||(LA2_0 >= 36 && LA2_0 <= 37)||LA2_0==42) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:24:17: statswithsemi
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statswithsemi_in_statlist180);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:26:1: statswithsemi : stat ;
	public final X_Reference_Counter.statswithsemi_return statswithsemi() throws RecognitionException {
		X_Reference_Counter.statswithsemi_return retval = new X_Reference_Counter.statswithsemi_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope stat10 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:26:14: ( stat )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:26:17: stat
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_statswithsemi189);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:1: stat : ( assignstat | condstat | whilestat | forstat | block );
	public final X_Reference_Counter.stat_return stat() throws RecognitionException {
		X_Reference_Counter.stat_return retval = new X_Reference_Counter.stat_return();
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:5: ( assignstat | condstat | whilestat | forstat | block )
			int alt3=5;
			switch ( input.LA(1) ) {
			case ASSIGN:
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:17: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat207);
					assignstat11=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat11.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:30: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat211);
					condstat12=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat12.getTree());

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:41: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat215);
					whilestat13=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat13.getTree());

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:53: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat219);
					forstat14=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat14.getTree());

					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:28:63: block
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_block_in_stat223);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:30:1: cond : ^( comparator expr expr ) ;
	public final X_Reference_Counter.cond_return cond() throws RecognitionException {
		X_Reference_Counter.cond_return retval = new X_Reference_Counter.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope comparator16 =null;
		TreeRuleReturnScope expr17 =null;
		TreeRuleReturnScope expr18 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:30:5: ( ^( comparator expr expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:30:17: ^( comparator expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_comparator_in_cond242);
			comparator16=comparator();
			state._fsp--;

			root_1 = (CommonTree)adaptor.becomeRoot(comparator16.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond244);
			expr17=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr17.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond246);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:32:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final X_Reference_Counter.condstat_return condstat() throws RecognitionException {
		X_Reference_Counter.condstat_return retval = new X_Reference_Counter.condstat_return();
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:32:9: ( ^( 'if' cond stat ( stat )? ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:32:17: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal19=(CommonTree)match(input,37,FOLLOW_37_in_condstat277); 
			string_literal19_tree = (CommonTree)adaptor.dupNode(string_literal19);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal19_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat279);
			cond20=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond20.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat281);
			stat21=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat21.getTree());

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:32:34: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ASSIGN && LA4_0 <= BLOCK)||(LA4_0 >= 36 && LA4_0 <= 37)||LA4_0==42) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:32:34: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat283);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:34:1: whilestat : ^( 'while' cond stat ) ;
	public final X_Reference_Counter.whilestat_return whilestat() throws RecognitionException {
		X_Reference_Counter.whilestat_return retval = new X_Reference_Counter.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal23=null;
		TreeRuleReturnScope cond24 =null;
		TreeRuleReturnScope stat25 =null;

		CommonTree string_literal23_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:34:10: ( ^( 'while' cond stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:34:17: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal23=(CommonTree)match(input,42,FOLLOW_42_in_whilestat299); 
			string_literal23_tree = (CommonTree)adaptor.dupNode(string_literal23);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal23_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat301);
			cond24=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond24.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat303);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:36:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final X_Reference_Counter.forstat_return forstat() throws RecognitionException {
		X_Reference_Counter.forstat_return retval = new X_Reference_Counter.forstat_return();
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:36:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:36:17: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal26=(CommonTree)match(input,36,FOLLOW_36_in_forstat335); 
			string_literal26_tree = (CommonTree)adaptor.dupNode(string_literal26);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat337);
			assignstat27=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat27.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat339);
			cond28=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond28.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat341);
			assignstat29=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat29.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat343);
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:38:1: assignstat : ^( ASSIGN id= ID expr ) ;
	public final X_Reference_Counter.assignstat_return assignstat() throws RecognitionException {
		X_Reference_Counter.assignstat_return retval = new X_Reference_Counter.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree id=null;
		CommonTree ASSIGN31=null;
		TreeRuleReturnScope expr32 =null;

		CommonTree id_tree=null;
		CommonTree ASSIGN31_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:38:11: ( ^( ASSIGN id= ID expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:38:17: ^( ASSIGN id= ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ASSIGN31=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignstat372); 
			ASSIGN31_tree = (CommonTree)adaptor.dupNode(ASSIGN31);


			root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			id=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat376); 
			id_tree = (CommonTree)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat378);
			expr32=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr32.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			num_assignments++; 
			                                      if(references.containsKey((id!=null?id.getText():null))) { references.put((id!=null?id.getText():null),1+(int)references.get((id!=null?id.getText():null))); }
			                                      else { references.put((id!=null?id.getText():null), 1);  }    
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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:1: expr : ( term | ( ^( operator term term ) ) );
	public final X_Reference_Counter.expr_return expr() throws RecognitionException {
		X_Reference_Counter.expr_return retval = new X_Reference_Counter.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope term33 =null;
		TreeRuleReturnScope operator34 =null;
		TreeRuleReturnScope term35 =null;
		TreeRuleReturnScope term36 =null;


		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:5: ( term | ( ^( operator term term ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= FLOAT && LA5_0 <= INT)||LA5_0==STRING) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= 22 && LA5_0 <= 24)||LA5_0==26) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:17: term
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr414);
					term33=term();
					state._fsp--;

					adaptor.addChild(root_0, term33.getTree());

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:24: ( ^( operator term term ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:24: ( ^( operator term term ) )
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:42:25: ^( operator term term )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_operator_in_expr420);
					operator34=operator();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(operator34.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr422);
					term35=term();
					state._fsp--;

					adaptor.addChild(root_1, term35.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_term_in_expr424);
					term36=term();
					state._fsp--;

					adaptor.addChild(root_1, term36.getTree());

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:44:1: term : ( INT | FLOAT | ID | STRING );
	public final X_Reference_Counter.term_return term() throws RecognitionException {
		X_Reference_Counter.term_return retval = new X_Reference_Counter.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set37=null;

		CommonTree set37_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:44:5: ( INT | FLOAT | ID | STRING )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set37=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= FLOAT && input.LA(1) <= INT)||input.LA(1)==STRING ) {
				input.consume();
				set37_tree = (CommonTree)adaptor.dupNode(set37);


				adaptor.addChild(root_0, set37_tree);

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
	// $ANTLR end "term"


	public static class operator_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:46:1: operator : ( '+' | '-' | '*' | '/' );
	public final X_Reference_Counter.operator_return operator() throws RecognitionException {
		X_Reference_Counter.operator_return retval = new X_Reference_Counter.operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set38=null;

		CommonTree set38_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:46:9: ( '+' | '-' | '*' | '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set38=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
				input.consume();
				set38_tree = (CommonTree)adaptor.dupNode(set38);


				adaptor.addChild(root_0, set38_tree);

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:48:1: comparator : ( '<' | '>' | '=' );
	public final X_Reference_Counter.comparator_return comparator() throws RecognitionException {
		X_Reference_Counter.comparator_return retval = new X_Reference_Counter.comparator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set39=null;

		CommonTree set39_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:48:11: ( '<' | '>' | '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set39=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set39_tree = (CommonTree)adaptor.dupNode(set39);


				adaptor.addChild(root_0, set39_tree);

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:50:1: decl : modifier ID TYPE ;
	public final X_Reference_Counter.decl_return decl() throws RecognitionException {
		X_Reference_Counter.decl_return retval = new X_Reference_Counter.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID41=null;
		CommonTree TYPE42=null;
		TreeRuleReturnScope modifier40 =null;

		CommonTree ID41_tree=null;
		CommonTree TYPE42_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:50:5: ( modifier ID TYPE )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:50:17: modifier ID TYPE
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_modifier_in_decl512);
			modifier40=modifier();
			state._fsp--;

			adaptor.addChild(root_0, modifier40.getTree());

			_last = (CommonTree)input.LT(1);
			ID41=(CommonTree)match(input,ID,FOLLOW_ID_in_decl514); 
			ID41_tree = (CommonTree)adaptor.dupNode(ID41);


			adaptor.addChild(root_0, ID41_tree);

			_last = (CommonTree)input.LT(1);
			TYPE42=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_decl517); 
			TYPE42_tree = (CommonTree)adaptor.dupNode(TYPE42);


			adaptor.addChild(root_0, TYPE42_tree);

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
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:1: modifier : ( 'read' 'print' | 'read' | 'print' )? ;
	public final X_Reference_Counter.modifier_return modifier() throws RecognitionException {
		X_Reference_Counter.modifier_return retval = new X_Reference_Counter.modifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal43=null;
		CommonTree string_literal44=null;
		CommonTree string_literal45=null;
		CommonTree string_literal46=null;

		CommonTree string_literal43_tree=null;
		CommonTree string_literal44_tree=null;
		CommonTree string_literal45_tree=null;
		CommonTree string_literal46_tree=null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:9: ( ( 'read' 'print' | 'read' | 'print' )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:17: ( 'read' 'print' | 'read' | 'print' )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:17: ( 'read' 'print' | 'read' | 'print' )?
			int alt6=4;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==40) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==38) ) {
					alt6=1;
				}
				else if ( (LA6_1==ID) ) {
					alt6=2;
				}
			}
			else if ( (LA6_0==38) ) {
				alt6=3;
			}
			switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:18: 'read' 'print'
					{
					_last = (CommonTree)input.LT(1);
					string_literal43=(CommonTree)match(input,40,FOLLOW_40_in_modifier531); 
					string_literal43_tree = (CommonTree)adaptor.dupNode(string_literal43);


					adaptor.addChild(root_0, string_literal43_tree);

					_last = (CommonTree)input.LT(1);
					string_literal44=(CommonTree)match(input,38,FOLLOW_38_in_modifier533); 
					string_literal44_tree = (CommonTree)adaptor.dupNode(string_literal44);


					adaptor.addChild(root_0, string_literal44_tree);

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:35: 'read'
					{
					_last = (CommonTree)input.LT(1);
					string_literal45=(CommonTree)match(input,40,FOLLOW_40_in_modifier537); 
					string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);


					adaptor.addChild(root_0, string_literal45_tree);

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Reference_Counter.g:52:44: 'print'
					{
					_last = (CommonTree)input.LT(1);
					string_literal46=(CommonTree)match(input,38,FOLLOW_38_in_modifier541); 
					string_literal46_tree = (CommonTree)adaptor.dupNode(string_literal46);


					adaptor.addChild(root_0, string_literal46_tree);

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



	public static final BitSet FOLLOW_39_in_program81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program83 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_decllist_in_program85 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_block_in_program88 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARE_in_decllist103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statlist_in_block150 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statswithsemi_in_statlist180 = new BitSet(new long[]{0x0000043000000032L});
	public static final BitSet FOLLOW_stat_in_statswithsemi189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparator_in_cond242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond244 = new BitSet(new long[]{0x0000000005C10E00L});
	public static final BitSet FOLLOW_expr_in_cond246 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_condstat277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat279 = new BitSet(new long[]{0x0000043000000030L});
	public static final BitSet FOLLOW_stat_in_condstat281 = new BitSet(new long[]{0x0000043000000038L});
	public static final BitSet FOLLOW_stat_in_condstat283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_whilestat299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat301 = new BitSet(new long[]{0x0000043000000030L});
	public static final BitSet FOLLOW_stat_in_whilestat303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_forstat335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat337 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat339 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_assignstat_in_forstat341 = new BitSet(new long[]{0x0000043000000030L});
	public static final BitSet FOLLOW_stat_in_forstat343 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignstat372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat376 = new BitSet(new long[]{0x0000000005C10E00L});
	public static final BitSet FOLLOW_expr_in_assignstat378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_term_in_expr414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expr420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_expr422 = new BitSet(new long[]{0x0000000000010E00L});
	public static final BitSet FOLLOW_term_in_expr424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_modifier_in_decl512 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl514 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_TYPE_in_decl517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier531 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_modifier533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_modifier537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_modifier541 = new BitSet(new long[]{0x0000000000000002L});
}
