grammar X;

options {
  language=Java;
  output=AST;
  TokenLabelType = XToken;
}

tokens {ASSIGN;DECLARE;BLOCK;COND;}

@lexer::header  {package dhbw.compilerbau.xparser; }
@parser::header {package dhbw.compilerbau.xparser; }

@lexer::members {

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
  
}



program :       'program' ID ';' decllist block '.' EOF  
                -> ^('program' ID decllist* block);

decllist:       decl*                               
                -> ^(DECLARE decl)*  ;    
                   
block:          'begin' statlist 'end' 
                -> ^(BLOCK statlist);
                
statlist:       statswithsemi*;

statswithsemi:  stat ';'!; 

stat:           assignstat | condstat | whilestat | forstat | block ;

cond:           expr comparator expr 
                -> ^(comparator expr expr );
                
condstat:       'if'^ cond 'then'! stat (options{greedy=true;}:'else'! stat)? ;

whilestat:      'while' '(' cond ')' stat 
                -> ^('while' cond stat);
                
forstat:        'for' '(' assignstat ';' cond ';' assignstat ')' stat 
                -> ^('for' assignstat cond assignstat stat);
                
assignstat:     ID ':=' expr 
                -> ^(ASSIGN ID expr);
                
expr:           expr2 (addOperator^ expr)?;

expr2:          expr3 (multOperator^ expr2)?;

expr3:          INT | FLOAT | ID | '('! expr ')'! | STRING;

addOperator:    '+' | '-';
multOperator:   '*'| '/';
comparator:     '<'|'>'|'=';

decl:           modifier ID ':'! TYPE ';'!;
modifier:       ('read' 'print' | 'read' | 'print')?;


TYPE:           'int' | 'float' | 'string';
ID:               LETTER (LETTER|DIGIT)* ;
fragment DIGIT:   '0'..'9';
fragment LETTER:  'a'..'z'|'A'..'Z';

fragment POSDIGIT: '1'..'9';
fragment ZERO:     '0';
fragment OTHER:    ' ' | '.' | ':' | '\\"';

INT: ZERO {intValue=0; } | 
     POSDIGIT {intValue = $text.charAt(0)-'0'; } (DIGIT {intValue = 10*intValue + $text.charAt(0)-'0';})*;

fragment NUMBER:  DIGIT {intValue = $text.charAt(0)-'0'; } (DIGIT {intValue = 10*intValue + $text.charAt(0)-'0';})*;
    
FLOAT:    INT { cardinalValue=intValue; fractionValue=0; fractionLength=0; exponentValue=0; exponentSign=1; }
          ('.' (NUMBER {fractionValue=intValue; fractionLength=$text.length(); })?)? 
          (('e'|'E')('+' {exponentSign=1; }|'-' {exponentSign=-1; })? INT { exponentValue=intValue; })?;
          
STRING:   '"' { stringValue=new StringBuffer(); } ((LETTER|DIGIT|OTHER) {stringValue.append($text.charAt($text.length()-1));})* '"';

WS:               (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


