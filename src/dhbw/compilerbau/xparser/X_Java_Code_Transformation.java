// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g 2014-06-17 09:44:38
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class X_Java_Code_Transformation extends TreeParser {
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


	public X_Java_Code_Transformation(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public X_Java_Code_Transformation(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("X_Java_Code_TransformationTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return X_Java_Code_Transformation.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g"; }

	 

	int num_assignments = 0; 


	public StringTemplate buildTemplate(String s) 
	{
		StringTemplate template = new StringTemplate("Hello, <name>");
		return template;
	}



	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:26:1: program : ^( 'program' ID (decls+= decllist )* block ) -> template(id=$ID.textdec=$decls) <<\npublic class <id> {\n <dec; separator=\"\\n\">\n}\n>>;
	public final X_Java_Code_Transformation.program_return program() throws RecognitionException {
		X_Java_Code_Transformation.program_return retval = new X_Java_Code_Transformation.program_return();
		retval.start = input.LT(1);

		CommonTree ID1=null;
		List<Object> list_decls=null;
		RuleReturnScope decls = null;
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:26:9: ( ^( 'program' ID (decls+= decllist )* block ) -> template(id=$ID.textdec=$decls) <<\npublic class <id> {\n <dec; separator=\"\\n\">\n}\n>>)
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:26:17: ^( 'program' ID (decls+= decllist )* block )
			{
			match(input,37,FOLLOW_37_in_program81); 
			match(input, Token.DOWN, null); 
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_program83); 
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:26:32: (decls+= decllist )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECLARE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:26:33: decls+= decllist
					{
					pushFollow(FOLLOW_decllist_in_program90);
					decls=decllist();
					state._fsp--;

					if (list_decls==null) list_decls=new ArrayList<Object>();
					list_decls.add(decls.getTemplate());
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_block_in_program94);
			block();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 27:17: -> template(id=$ID.textdec=$decls) <<\npublic class <id> {\n <dec; separator=\"\\n\">\n}\n>>
			{
				retval.st = new StringTemplate(templateLib, "\npublic class <id> {\n  <dec; separator=\"\\n\">\n}\n",new STAttrMap().put("id", (ID1!=null?ID1.getText():null)).put("dec", list_decls));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decllist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:34:1: decllist : ^( DECLARE decl ) -> template(x=$decl.st) \"<x>\";
	public final X_Java_Code_Transformation.decllist_return decllist() throws RecognitionException {
		X_Java_Code_Transformation.decllist_return retval = new X_Java_Code_Transformation.decllist_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope decl2 =null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:34:9: ( ^( DECLARE decl ) -> template(x=$decl.st) \"<x>\")
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:34:17: ^( DECLARE decl )
			{
			match(input,DECLARE,FOLLOW_DECLARE_in_decllist144); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_decl_in_decllist146);
			decl2=decl();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 34:33: -> template(x=$decl.st) \"<x>\"
			{
				retval.st = new StringTemplate(templateLib, "<x>",new STAttrMap().put("x", (decl2!=null?((StringTemplate)decl2.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "block"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:36:1: block : ^( BLOCK statlist ) ;
	public final X_Java_Code_Transformation.block_return block() throws RecognitionException {
		X_Java_Code_Transformation.block_return retval = new X_Java_Code_Transformation.block_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:36:6: ( ^( BLOCK statlist ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:36:17: ^( BLOCK statlist )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_block200); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				pushFollow(FOLLOW_statlist_in_block202);
				statlist();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statlist"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:38:1: statlist : ( statswithsemi )* ;
	public final X_Java_Code_Transformation.statlist_return statlist() throws RecognitionException {
		X_Java_Code_Transformation.statlist_return retval = new X_Java_Code_Transformation.statlist_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:38:9: ( ( statswithsemi )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:38:17: ( statswithsemi )*
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:38:17: ( statswithsemi )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ASSIGN && LA2_0 <= BLOCK)||(LA2_0 >= 34 && LA2_0 <= 35)||LA2_0==40) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:38:17: statswithsemi
					{
					pushFollow(FOLLOW_statswithsemi_in_statlist232);
					statswithsemi();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statswithsemi"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:40:1: statswithsemi : stat ;
	public final X_Java_Code_Transformation.statswithsemi_return statswithsemi() throws RecognitionException {
		X_Java_Code_Transformation.statswithsemi_return retval = new X_Java_Code_Transformation.statswithsemi_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:40:14: ( stat )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:40:17: stat
			{
			pushFollow(FOLLOW_stat_in_statswithsemi241);
			stat();
			state._fsp--;

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:1: stat : ( assignstat | condstat | whilestat | forstat | block );
	public final X_Java_Code_Transformation.stat_return stat() throws RecognitionException {
		X_Java_Code_Transformation.stat_return retval = new X_Java_Code_Transformation.stat_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:5: ( assignstat | condstat | whilestat | forstat | block )
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:17: assignstat
					{
					pushFollow(FOLLOW_assignstat_in_stat259);
					assignstat();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:30: condstat
					{
					pushFollow(FOLLOW_condstat_in_stat263);
					condstat();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:41: whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat267);
					whilestat();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:53: forstat
					{
					pushFollow(FOLLOW_forstat_in_stat271);
					forstat();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:42:63: block
					{
					pushFollow(FOLLOW_block_in_stat275);
					block();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "cond"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:44:1: cond : ^( comparator expr expr ) ;
	public final X_Java_Code_Transformation.cond_return cond() throws RecognitionException {
		X_Java_Code_Transformation.cond_return retval = new X_Java_Code_Transformation.cond_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:44:5: ( ^( comparator expr expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:44:17: ^( comparator expr expr )
			{
			pushFollow(FOLLOW_comparator_in_cond294);
			comparator();
			state._fsp--;

			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_cond296);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_expr_in_cond298);
			expr();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "condstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:46:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final X_Java_Code_Transformation.condstat_return condstat() throws RecognitionException {
		X_Java_Code_Transformation.condstat_return retval = new X_Java_Code_Transformation.condstat_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:46:9: ( ^( 'if' cond stat ( stat )? ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:46:17: ^( 'if' cond stat ( stat )? )
			{
			match(input,35,FOLLOW_35_in_condstat329); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_condstat331);
			cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_condstat333);
			stat();
			state._fsp--;

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:46:34: ( stat )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ASSIGN && LA4_0 <= BLOCK)||(LA4_0 >= 34 && LA4_0 <= 35)||LA4_0==40) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:46:34: stat
					{
					pushFollow(FOLLOW_stat_in_condstat335);
					stat();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whilestat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:48:1: whilestat : ^( 'while' cond stat ) ;
	public final X_Java_Code_Transformation.whilestat_return whilestat() throws RecognitionException {
		X_Java_Code_Transformation.whilestat_return retval = new X_Java_Code_Transformation.whilestat_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:48:10: ( ^( 'while' cond stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:48:17: ^( 'while' cond stat )
			{
			match(input,40,FOLLOW_40_in_whilestat351); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_whilestat353);
			cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_whilestat355);
			stat();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:50:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final X_Java_Code_Transformation.forstat_return forstat() throws RecognitionException {
		X_Java_Code_Transformation.forstat_return retval = new X_Java_Code_Transformation.forstat_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:50:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:50:17: ^( 'for' assignstat cond assignstat stat )
			{
			match(input,34,FOLLOW_34_in_forstat387); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignstat_in_forstat389);
			assignstat();
			state._fsp--;

			pushFollow(FOLLOW_cond_in_forstat391);
			cond();
			state._fsp--;

			pushFollow(FOLLOW_assignstat_in_forstat393);
			assignstat();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_forstat395);
			stat();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignstat"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:52:1: assignstat : ^( ASSIGN ID expr ) ;
	public final X_Java_Code_Transformation.assignstat_return assignstat() throws RecognitionException {
		X_Java_Code_Transformation.assignstat_return retval = new X_Java_Code_Transformation.assignstat_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:52:11: ( ^( ASSIGN ID expr ) )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:52:17: ^( ASSIGN ID expr )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignstat424); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_assignstat426); 
			pushFollow(FOLLOW_expr_in_assignstat428);
			expr();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:1: expr : ( term | ( ^( operator term term ) ) );
	public final X_Java_Code_Transformation.expr_return expr() throws RecognitionException {
		X_Java_Code_Transformation.expr_return retval = new X_Java_Code_Transformation.expr_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:5: ( term | ( ^( operator term term ) ) )
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:17: term
					{
					pushFollow(FOLLOW_term_in_expr462);
					term();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:24: ( ^( operator term term ) )
					{
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:24: ( ^( operator term term ) )
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:54:25: ^( operator term term )
					{
					pushFollow(FOLLOW_operator_in_expr468);
					operator();
					state._fsp--;

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_term_in_expr470);
					term();
					state._fsp--;

					pushFollow(FOLLOW_term_in_expr472);
					term();
					state._fsp--;

					match(input, Token.UP, null); 

					}

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "term"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:56:1: term : ( INT | FLOAT | ID | STRING );
	public final X_Java_Code_Transformation.term_return term() throws RecognitionException {
		X_Java_Code_Transformation.term_return retval = new X_Java_Code_Transformation.term_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:56:5: ( INT | FLOAT | ID | STRING )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:
			{
			if ( (input.LA(1) >= FLOAT && input.LA(1) <= INT)||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:58:1: operator : ( '+' | '-' | '*' | '/' );
	public final X_Java_Code_Transformation.operator_return operator() throws RecognitionException {
		X_Java_Code_Transformation.operator_return retval = new X_Java_Code_Transformation.operator_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:58:9: ( '+' | '-' | '*' | '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:
			{
			if ( (input.LA(1) >= 20 && input.LA(1) <= 22)||input.LA(1)==24 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "comparator"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:60:1: comparator : ( '<' | '>' | '=' );
	public final X_Java_Code_Transformation.comparator_return comparator() throws RecognitionException {
		X_Java_Code_Transformation.comparator_return retval = new X_Java_Code_Transformation.comparator_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:60:11: ( '<' | '>' | '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:
			{
			if ( (input.LA(1) >= 28 && input.LA(1) <= 30) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decl"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:62:1: decl : modifier ID TYPE -> template(x=$IDy=$TYPEmod=$modifier.st) \"<y> <x> <mod>;\";
	public final X_Java_Code_Transformation.decl_return decl() throws RecognitionException {
		X_Java_Code_Transformation.decl_return retval = new X_Java_Code_Transformation.decl_return();
		retval.start = input.LT(1);

		CommonTree ID3=null;
		CommonTree TYPE4=null;
		TreeRuleReturnScope modifier5 =null;

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:62:5: ( modifier ID TYPE -> template(x=$IDy=$TYPEmod=$modifier.st) \"<y> <x> <mod>;\")
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:62:17: modifier ID TYPE
			{
			pushFollow(FOLLOW_modifier_in_decl560);
			modifier5=modifier();
			state._fsp--;

			ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_decl562); 
			TYPE4=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_decl565); 
			// TEMPLATE REWRITE
			// 62:35: -> template(x=$IDy=$TYPEmod=$modifier.st) \"<y> <x> <mod>;\"
			{
				retval.st = new StringTemplate(templateLib, "<y> <x> <mod>;",new STAttrMap().put("x", ID3).put("y", TYPE4).put("mod", (modifier5!=null?((StringTemplate)modifier5.getTemplate()):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "modifier"
	// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:65:1: modifier :;
	public final X_Java_Code_Transformation.modifier_return modifier() throws RecognitionException {
		X_Java_Code_Transformation.modifier_return retval = new X_Java_Code_Transformation.modifier_return();
		retval.start = input.LT(1);

		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:65:9: ()
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X_Java_Code_Transformation.g:65:11: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"

	// Delegated rules



	public static final BitSet FOLLOW_37_in_program81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program83 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_decllist_in_program90 = new BitSet(new long[]{0x00000000000000A0L});
	public static final BitSet FOLLOW_block_in_program94 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARE_in_decllist144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist146 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block200 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statlist_in_block202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statswithsemi_in_statlist232 = new BitSet(new long[]{0x0000010C00000032L});
	public static final BitSet FOLLOW_stat_in_statswithsemi241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparator_in_cond294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond296 = new BitSet(new long[]{0x0000000001708E00L});
	public static final BitSet FOLLOW_expr_in_cond298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_condstat329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat331 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_condstat333 = new BitSet(new long[]{0x0000010C00000038L});
	public static final BitSet FOLLOW_stat_in_condstat335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_40_in_whilestat351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat353 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_whilestat355 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_forstat387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat389 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_cond_in_forstat391 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_assignstat_in_forstat393 = new BitSet(new long[]{0x0000010C00000030L});
	public static final BitSet FOLLOW_stat_in_forstat395 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignstat424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat426 = new BitSet(new long[]{0x0000000001708E00L});
	public static final BitSet FOLLOW_expr_in_assignstat428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_term_in_expr462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expr468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_term_in_expr470 = new BitSet(new long[]{0x0000000000008E00L});
	public static final BitSet FOLLOW_term_in_expr472 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_modifier_in_decl560 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_decl562 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_TYPE_in_decl565 = new BitSet(new long[]{0x0000000000000002L});
}
