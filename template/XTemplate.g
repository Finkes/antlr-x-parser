tree grammar XTemplate;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}

@header {package dhbw.compilerbau.xparser; }
@members { int num_assignments = 0; }


program :       ^('program' ID decllist* block);

decllist:       ^(DECLARE decl)  ;    
                   
block:          ^(BLOCK statlist);
                
statlist:       statswithsemi*;

statswithsemi:  stat; 

stat:           assignstat | condstat | whilestat | forstat | block ;

cond:           ^(comparator expr expr);
                
condstat:       ^('if' cond stat stat?) ;

whilestat:      ^('while' cond stat);
                
forstat:        ^('for' assignstat cond assignstat stat);
                
assignstat:     ^(ASSIGN ID expr);
                
expr:           term | (^(operator term term));

term:           INT | FLOAT | ID  | STRING;

operator:       '+' | '-' | '*'| '/';

comparator:     '<'|'>'|'=';

decl:           modifier ID  TYPE;

modifier:       ('read' 'print' | 'read' | 'print')?;

