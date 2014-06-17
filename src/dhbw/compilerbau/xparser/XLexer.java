// $ANTLR 3.5.2 /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g 2014-06-17 10:04:26
package dhbw.compilerbau.xparser; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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


	 @Override
	 public Token emit() 
	 {
	    XToken t = new XToken(input, state.type, state.channel, 
	    state.tokenStartCharIndex, getCharIndex()-1);
	    
	    t.setLine(state.tokenStartLine);
	    t.setText(state.text);
	    t.setCharPositionInLine(state.tokenStartCharPositionInLine);
	    
	    switch(state.type) 
	    {
	      case INT: t.intValue = intValue; 
	      break;
	      
	      case FLOAT: t.floatValue = cardinalValue+(fractionValue/Math.pow(10,fractionLength))*Math.pow(10,exponentSign*exponentValue); 
	      break;
	      
	      case STRING: t.stringValue = stringValue.toString();
	    }
	    emit(t);
	    return t;
	  }
	  
	  private int intValue;
	  private int cardinalValue;
	  private int fractionValue;
	  private int fractionLength;
	  private int exponentValue;
	  private int exponentSign;
	  private StringBuffer stringValue;
	  


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

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:45:7: ( '(' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:45:9: '('
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:46:7: ( ')' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:46:9: ')'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:47:7: ( '*' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:47:9: '*'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:48:7: ( '+' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:48:9: '+'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:49:7: ( '-' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:49:9: '-'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:50:7: ( '.' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:50:9: '.'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:51:7: ( '/' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:51:9: '/'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:52:7: ( ':' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:52:9: ':'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:53:7: ( ':=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:53:9: ':='
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:54:7: ( ';' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:54:9: ';'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:7: ( '<' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:55:9: '<'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:56:7: ( '=' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:56:9: '='
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:57:7: ( '>' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:57:9: '>'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:58:7: ( 'begin' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:58:9: 'begin'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:59:7: ( 'else' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:59:9: 'else'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:60:7: ( 'end' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:60:9: 'end'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:7: ( 'for' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:61:9: 'for'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:62:7: ( 'if' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:62:9: 'if'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:63:7: ( 'print' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:63:9: 'print'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:64:7: ( 'program' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:64:9: 'program'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:7: ( 'read' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:65:9: 'read'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:66:7: ( 'then' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:66:9: 'then'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:67:7: ( 'while' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:67:9: 'while'
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
	// $ANTLR end "T__42"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:95:5: ( 'int' | 'float' | 'string' )
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
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:95:17: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:95:25: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:95:35: 'string'
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:96:3: ( LETTER ( LETTER | DIGIT )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:96:19: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:96:26: ( LETTER | DIGIT )*
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:97:15: ( '0' .. '9' )
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:98:16: ( 'a' .. 'z' | 'A' .. 'Z' )
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

	// $ANTLR start "POSDIGIT"
	public final void mPOSDIGIT() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:100:18: ( '1' .. '9' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "POSDIGIT"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:101:14: ( '0' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:101:20: '0'
			{
			match('0'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:102:15: ( ' ' | '.' | ':' | '\\\\\"' )
			int alt3=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt3=1;
				}
				break;
			case '.':
				{
				alt3=2;
				}
				break;
			case ':':
				{
				alt3=3;
				}
				break;
			case '\\':
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:102:20: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:102:26: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:102:32: ':'
					{
					match(':'); 
					}
					break;
				case 4 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:102:38: '\\\\\"'
					{
					match("\\\""); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:104:4: ( ZERO | POSDIGIT ( DIGIT )* )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:104:6: ZERO
					{
					mZERO(); 

					intValue=0; 
					}
					break;
				case 2 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:105:6: POSDIGIT ( DIGIT )*
					{
					mPOSDIGIT(); 

					intValue = getText().charAt(0)-'0'; 
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:105:50: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:105:51: DIGIT
							{
							mDIGIT(); 

							intValue = 10*intValue + getText().charAt(0)-'0';
							}
							break;

						default :
							break loop4;
						}
					}

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
	// $ANTLR end "INT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:107:16: ( DIGIT ( DIGIT )* )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:107:19: DIGIT ( DIGIT )*
			{
			mDIGIT(); 

			intValue = getText().charAt(0)-'0'; 
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:107:60: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:107:61: DIGIT
					{
					mDIGIT(); 

					intValue = 10*intValue + getText().charAt(0)-'0';
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:109:6: ( INT ( '.' ( NUMBER )? )? ( ( 'e' | 'E' ) ( '+' | '-' )? INT )? )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:109:11: INT ( '.' ( NUMBER )? )? ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
			{
			mINT(); 

			 cardinalValue=intValue; fractionValue=0; fractionLength=0; exponentValue=0; exponentSign=1; 
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:110:11: ( '.' ( NUMBER )? )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='.') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:110:12: '.' ( NUMBER )?
					{
					match('.'); 
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:110:16: ( NUMBER )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:110:17: NUMBER
							{
							mNUMBER(); 

							fractionValue=intValue; fractionLength=getText().length(); 
							}
							break;

					}

					}
					break;

			}

			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:111:11: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='E'||LA10_0=='e') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:111:12: ( 'e' | 'E' ) ( '+' | '-' )? INT
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:111:21: ( '+' | '-' )?
					int alt9=3;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='+') ) {
						alt9=1;
					}
					else if ( (LA9_0=='-') ) {
						alt9=2;
					}
					switch (alt9) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:111:22: '+'
							{
							match('+'); 
							exponentSign=1; 
							}
							break;
						case 2 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:111:45: '-'
							{
							match('-'); 
							exponentSign=-1; 
							}
							break;

					}

					mINT(); 

					 exponentValue=intValue; 
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
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:7: ( '\"' ( ( LETTER | DIGIT | OTHER ) )* '\"' )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:11: '\"' ( ( LETTER | DIGIT | OTHER ) )* '\"'
			{
			match('\"'); 
			 stringValue=new StringBuffer(); 
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:51: ( ( LETTER | DIGIT | OTHER ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==' '||LA12_0=='.'||(LA12_0 >= '0' && LA12_0 <= ':')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='\\'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:52: ( LETTER | DIGIT | OTHER )
					{
					// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:52: ( LETTER | DIGIT | OTHER )
					int alt11=3;
					switch ( input.LA(1) ) {
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
					case 'G':
					case 'H':
					case 'I':
					case 'J':
					case 'K':
					case 'L':
					case 'M':
					case 'N':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'T':
					case 'U':
					case 'V':
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						{
						alt11=1;
						}
						break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						{
						alt11=2;
						}
						break;
					case ' ':
					case '.':
					case ':':
					case '\\':
						{
						alt11=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:53: LETTER
							{
							mLETTER(); 

							}
							break;
						case 2 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:60: DIGIT
							{
							mDIGIT(); 

							}
							break;
						case 3 :
							// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:113:66: OTHER
							{
							mOTHER(); 

							}
							break;

					}

					stringValue.append(getText().charAt(getText().length()-1));
					}
					break;

				default :
					break loop12;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:115:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:115:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:115:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
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
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
		// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | TYPE | ID | INT | FLOAT | STRING | WS )
		int alt14=29;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:10: T__20
				{
				mT__20(); 

				}
				break;
			case 2 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:16: T__21
				{
				mT__21(); 

				}
				break;
			case 3 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:22: T__22
				{
				mT__22(); 

				}
				break;
			case 4 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:28: T__23
				{
				mT__23(); 

				}
				break;
			case 5 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:34: T__24
				{
				mT__24(); 

				}
				break;
			case 6 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:40: T__25
				{
				mT__25(); 

				}
				break;
			case 7 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:46: T__26
				{
				mT__26(); 

				}
				break;
			case 8 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:52: T__27
				{
				mT__27(); 

				}
				break;
			case 9 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:58: T__28
				{
				mT__28(); 

				}
				break;
			case 10 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:64: T__29
				{
				mT__29(); 

				}
				break;
			case 11 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:70: T__30
				{
				mT__30(); 

				}
				break;
			case 12 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:76: T__31
				{
				mT__31(); 

				}
				break;
			case 13 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:82: T__32
				{
				mT__32(); 

				}
				break;
			case 14 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:88: T__33
				{
				mT__33(); 

				}
				break;
			case 15 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:94: T__34
				{
				mT__34(); 

				}
				break;
			case 16 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:100: T__35
				{
				mT__35(); 

				}
				break;
			case 17 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:106: T__36
				{
				mT__36(); 

				}
				break;
			case 18 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:112: T__37
				{
				mT__37(); 

				}
				break;
			case 19 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:118: T__38
				{
				mT__38(); 

				}
				break;
			case 20 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:124: T__39
				{
				mT__39(); 

				}
				break;
			case 21 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:130: T__40
				{
				mT__40(); 

				}
				break;
			case 22 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:136: T__41
				{
				mT__41(); 

				}
				break;
			case 23 :
				// /home/dominik/dev/java/AntlrX/src/dhbw/compilerbau/xparser/X.g:1:142: T__42
				{
				mT__42(); 

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


	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA14_eotS =
		"\10\uffff\1\34\4\uffff\11\26\1\uffff\2\51\4\uffff\5\26\1\61\6\26\2\uffff"+
		"\1\51\2\26\1\73\1\74\1\26\1\uffff\1\76\7\26\1\106\2\uffff\1\26\1\uffff"+
		"\2\26\1\112\1\113\2\26\1\116\1\uffff\1\76\1\117\1\26\2\uffff\1\121\1\26"+
		"\2\uffff\1\26\1\uffff\1\76\1\124\1\uffff";
	static final String DFA14_eofS =
		"\125\uffff";
	static final String DFA14_minS =
		"\1\11\7\uffff\1\75\4\uffff\1\145\2\154\1\146\1\162\1\145\2\150\1\164\1"+
		"\uffff\2\56\4\uffff\1\147\1\163\1\144\1\162\1\157\1\60\1\164\1\151\1\141"+
		"\1\145\1\151\1\162\2\uffff\1\56\1\151\1\145\2\60\1\141\1\uffff\1\60\1"+
		"\156\1\147\1\144\1\156\1\154\1\151\1\156\1\60\2\uffff\1\164\1\uffff\1"+
		"\164\1\162\2\60\1\145\1\156\1\60\1\uffff\2\60\1\141\2\uffff\1\60\1\147"+
		"\2\uffff\1\155\1\uffff\2\60\1\uffff";
	static final String DFA14_maxS =
		"\1\172\7\uffff\1\75\4\uffff\1\145\1\156\1\157\1\156\1\162\1\145\2\150"+
		"\1\164\1\uffff\2\145\4\uffff\1\147\1\163\1\144\1\162\1\157\1\172\1\164"+
		"\1\157\1\141\1\145\1\151\1\162\2\uffff\1\145\1\151\1\145\2\172\1\141\1"+
		"\uffff\1\172\1\156\1\147\1\144\1\156\1\154\1\151\1\156\1\172\2\uffff\1"+
		"\164\1\uffff\1\164\1\162\2\172\1\145\1\156\1\172\1\uffff\2\172\1\141\2"+
		"\uffff\1\172\1\147\2\uffff\1\155\1\uffff\2\172\1\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15\11\uffff"+
		"\1\31\2\uffff\1\34\1\35\1\11\1\10\14\uffff\1\32\1\33\6\uffff\1\22\11\uffff"+
		"\1\20\1\21\1\uffff\1\30\7\uffff\1\17\3\uffff\1\25\1\26\2\uffff\1\16\1"+
		"\23\1\uffff\1\27\2\uffff\1\24";
	static final String DFA14_specialS =
		"\125\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\31\5\uffff\1\1\1\2\1\3\1\4"+
			"\1\uffff\1\5\1\6\1\7\1\27\11\30\1\10\1\11\1\12\1\13\1\14\2\uffff\32\26"+
			"\6\uffff\1\26\1\15\2\26\1\16\1\17\2\26\1\20\6\26\1\21\1\26\1\22\1\25"+
			"\1\23\2\26\1\24\3\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"",
			"",
			"",
			"",
			"\1\35",
			"\1\36\1\uffff\1\37",
			"\1\41\2\uffff\1\40",
			"\1\42\7\uffff\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"",
			"\1\52\26\uffff\1\52\37\uffff\1\52",
			"\1\52\1\uffff\12\53\13\uffff\1\52\37\uffff\1\52",
			"",
			"",
			"",
			"",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\62",
			"\1\63\5\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"",
			"",
			"\1\52\1\uffff\12\53\13\uffff\1\52\37\uffff\1\52",
			"\1\71",
			"\1\72",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\75",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"",
			"\1\107",
			"",
			"\1\110",
			"\1\111",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\114",
			"\1\115",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\120",
			"",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\122",
			"",
			"",
			"\1\123",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | TYPE | ID | INT | FLOAT | STRING | WS );";
		}
	}

}
