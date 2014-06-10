// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g 2014-06-01 15:44:51
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public XLexer() {} 
	public XLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public XLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:9:7: ( '(' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:10:7: ( ')' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:11:7: ( '*' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:12:7: ( '+' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:12:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:13:7: ( '-' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:14:7: ( '.' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:14:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:7: ( '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:15:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:7: ( ':' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:16:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:7: ( ':=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:17:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:7: ( ';' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:19:7: ( '<' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:7: ( '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:20:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:21:7: ( '>' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:21:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:7: ( 'begin' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:22:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:7: ( 'else' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:23:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:7: ( 'end' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:24:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:7: ( 'for' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:25:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:7: ( 'if' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:26:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:7: ( 'print' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:27:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:7: ( 'program' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:28:9: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:29:7: ( 'read' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:29:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:30:7: ( 'then' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:30:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:31:7: ( 'while' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:31:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:38:5: ( 'int' | 'float' | 'string' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt1=1;
				}
				break;
			case 'f':
				{
				alt1=2;
				}
				break;
			case 's':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:38:17: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:38:25: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:38:35: 'string'
					{
					match("string"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:39:3: ( LETTER ( LETTER | DIGIT )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:39:19: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:39:26: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:40:15: ( '0' .. '9' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:41:16: ( 'a' .. 'z' | 'A' .. 'Z' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:16: ( '0' | ( '1' .. '9' ( DIGIT )* ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:19: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:24: ( '1' .. '9' ( DIGIT )* )
					{
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:24: ( '1' .. '9' ( DIGIT )* )
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:25: '1' .. '9' ( DIGIT )*
					{
					matchRange('1','9'); 
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:42:34: ( DIGIT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:43:4: ( ( '-' )? NUMBER )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:43:19: ( '-' )? NUMBER
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:43:19: ( '-' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='-') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:43:19: '-'
					{
					match('-'); 
					}
					break;

			}

			mNUMBER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:6: ( INT ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '-' )? NUMBER )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:19: INT ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '-' )? NUMBER )?
			{
			mINT(); 

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:23: ( '.' ( DIGIT )* )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:24: '.' ( DIGIT )*
					{
					match('.'); 
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:28: ( DIGIT )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

			}

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:38: ( ( 'e' | 'E' ) ( '-' )? NUMBER )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='E'||LA9_0=='e') ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:39: ( 'e' | 'E' ) ( '-' )? NUMBER
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:49: ( '-' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='-') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:44:49: '-'
							{
							match('-'); 
							}
							break;

					}

					mNUMBER(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:45:7: ( '\"' ( LETTER | DIGIT | OTHER )* '\"' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:45:19: '\"' ( LETTER | DIGIT | OTHER )* '\"'
			{
			match('\"'); 
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:45:23: ( LETTER | DIGIT | OTHER )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\"') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1==' '||LA10_1=='\"'||LA10_1=='.'||(LA10_1 >= '0' && LA10_1 <= ':')||(LA10_1 >= 'A' && LA10_1 <= 'Z')||(LA10_1 >= 'a' && LA10_1 <= 'z')) ) {
						alt10=1;
					}

				}
				else if ( (LA10_0==' '||LA10_0=='.'||(LA10_0 >= '0' && LA10_0 <= ':')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
					{
					if ( input.LA(1)==' '||input.LA(1)=='\"'||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:46:15: ( ' ' | '.' | ':' | '\"' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			if ( input.LA(1)==' '||input.LA(1)=='\"'||input.LA(1)=='.'||input.LA(1)==':' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:47:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:47:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:47:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | TYPE | ID | INT | FLOAT | STRING | WS )
		int alt12=29;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:70: T__28
				{
				mT__28(); 

				}
				break;
			case 12 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:76: T__29
				{
				mT__29(); 

				}
				break;
			case 13 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:82: T__30
				{
				mT__30(); 

				}
				break;
			case 14 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:88: T__31
				{
				mT__31(); 

				}
				break;
			case 15 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:94: T__32
				{
				mT__32(); 

				}
				break;
			case 16 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:100: T__33
				{
				mT__33(); 

				}
				break;
			case 17 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:106: T__34
				{
				mT__34(); 

				}
				break;
			case 18 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:112: T__35
				{
				mT__35(); 

				}
				break;
			case 19 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:118: T__36
				{
				mT__36(); 

				}
				break;
			case 20 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:124: T__37
				{
				mT__37(); 

				}
				break;
			case 21 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:130: T__38
				{
				mT__38(); 

				}
				break;
			case 22 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:136: T__39
				{
				mT__39(); 

				}
				break;
			case 23 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:142: T__40
				{
				mT__40(); 

				}
				break;
			case 24 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:148: TYPE
				{
				mTYPE(); 

				}
				break;
			case 25 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:153: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:156: INT
				{
				mINT(); 

				}
				break;
			case 27 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:160: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 28 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:166: STRING
				{
				mSTRING(); 

				}
				break;
			case 29 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:173: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\5\uffff\1\33\2\uffff\1\35\4\uffff\11\26\1\uffff\2\52\5\uffff\5\26\1\62"+
		"\6\26\2\uffff\1\52\2\26\1\74\1\75\1\26\1\uffff\1\77\7\26\1\107\2\uffff"+
		"\1\26\1\uffff\2\26\1\113\1\114\2\26\1\117\1\uffff\1\77\1\120\1\26\2\uffff"+
		"\1\122\1\26\2\uffff\1\26\1\uffff\1\77\1\125\1\uffff";
	static final String DFA12_eofS =
		"\126\uffff";
	static final String DFA12_minS =
		"\1\11\4\uffff\1\60\2\uffff\1\75\4\uffff\1\145\2\154\1\146\1\162\1\145"+
		"\2\150\1\164\1\uffff\2\56\5\uffff\1\147\1\163\1\144\1\162\1\157\1\60\1"+
		"\164\1\151\1\141\1\145\1\151\1\162\2\uffff\1\56\1\151\1\145\2\60\1\141"+
		"\1\uffff\1\60\1\156\1\147\1\144\1\156\1\154\1\151\1\156\1\60\2\uffff\1"+
		"\164\1\uffff\1\164\1\162\2\60\1\145\1\156\1\60\1\uffff\2\60\1\141\2\uffff"+
		"\1\60\1\147\2\uffff\1\155\1\uffff\2\60\1\uffff";
	static final String DFA12_maxS =
		"\1\172\4\uffff\1\71\2\uffff\1\75\4\uffff\1\145\1\156\1\157\1\156\1\162"+
		"\1\145\2\150\1\164\1\uffff\2\145\5\uffff\1\147\1\163\1\144\1\162\1\157"+
		"\1\172\1\164\1\157\1\141\1\145\1\151\1\162\2\uffff\1\145\1\151\1\145\2"+
		"\172\1\141\1\uffff\1\172\1\156\1\147\1\144\1\156\1\154\1\151\1\156\1\172"+
		"\2\uffff\1\164\1\uffff\1\164\1\162\2\172\1\145\1\156\1\172\1\uffff\2\172"+
		"\1\141\2\uffff\1\172\1\147\2\uffff\1\155\1\uffff\2\172\1\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15\11"+
		"\uffff\1\31\2\uffff\1\34\1\35\1\5\1\11\1\10\14\uffff\1\32\1\33\6\uffff"+
		"\1\22\11\uffff\1\20\1\21\1\uffff\1\30\7\uffff\1\17\3\uffff\1\25\1\26\2"+
		"\uffff\1\16\1\23\1\uffff\1\27\2\uffff\1\24";
	static final String DFA12_specialS =
		"\126\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\31\5\uffff\1\1\1\2\1\3\1\4"+
			"\1\uffff\1\5\1\6\1\7\1\27\11\30\1\10\1\11\1\12\1\13\1\14\2\uffff\32\26"+
			"\6\uffff\1\26\1\15\2\26\1\16\1\17\2\26\1\20\6\26\1\21\1\26\1\22\1\25"+
			"\1\23\2\26\1\24\3\26",
			"",
			"",
			"",
			"",
			"\1\27\11\30",
			"",
			"",
			"\1\34",
			"",
			"",
			"",
			"",
			"\1\36",
			"\1\37\1\uffff\1\40",
			"\1\42\2\uffff\1\41",
			"\1\43\7\uffff\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"\1\53\26\uffff\1\53\37\uffff\1\53",
			"\1\53\1\uffff\12\54\13\uffff\1\53\37\uffff\1\53",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\63",
			"\1\64\5\uffff\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"",
			"",
			"\1\53\1\uffff\12\54\13\uffff\1\53\37\uffff\1\53",
			"\1\72",
			"\1\73",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\76",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\115",
			"\1\116",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\121",
			"",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\123",
			"",
			"",
			"\1\124",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | TYPE | ID | INT | FLOAT | STRING | WS );";
		}
	}

}
