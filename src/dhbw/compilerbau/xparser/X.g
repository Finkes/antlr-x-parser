grammar X;

options {
  language=Java;
  output=AST;
}

tokens {ASSIGN;DECLARE;BLOCK;}

@lexer::header  {package dhbw.compilerbau.xparser; }
@parser::header {package dhbw.compilerbau.xparser; }



program :       'program' ID ';' decllist block '.' EOF  -> ^('program' ID decllist* block);
decllist:       decl*                               ->       ^(DECLARE decl)*  ;       
block:          'begin' statlist 'end' -> ^(BLOCK statlist*);
statlist:       statswithsemi*;
statswithsemi:  stat ';'!; 
stat:           assignstat | condstat | whilestat | forstat | block ;
cond:           expr ('<'|'>'|'=') expr;
condstat:       'if' cond 'then' stat ('else' stat)? ;
whilestat:      'while' '(' cond ')' stat -> ^('while' cond stat);
forstat:        'for' '(' assignstat ';' cond ';' assignstat ')' stat -> ^('for' assignstat cond assignstat stat);
assignstat:     ID ':=' expr -> ^(ASSIGN ID expr);
expr:           expr2 (addOperator^ expr)?;
expr2:          expr3 (multOperator^ expr2)?;
expr3:          INT | FLOAT | ID | '('! expr ')'! | STRING;

addOperator:    '+' | '-';
multOperator:   '*'| '/';

decl:           modifier ID ':'! TYPE ';'!;
modifier:       ('read' 'print' | 'read' | 'print')?;


TYPE:           'int' | 'float' | 'string';
ID:               LETTER (LETTER|DIGIT)* ;
fragment DIGIT:   '0'..'9';
fragment LETTER:  'a'..'z'|'A'..'Z';
fragment NUMBER:  '0'| ('1'..'9' DIGIT*);
INT:              '-'? NUMBER;
FLOAT:            INT ('.' DIGIT* )? (('e'|'E') '-'? NUMBER)?;
STRING:           '"' (LETTER|DIGIT|OTHER)* '"';
fragment OTHER:            ' ' | '.' |':'|'"';
WS:               (' ' | '\t' | '\r'| '\n')+ {$channel=HIDDEN;};


