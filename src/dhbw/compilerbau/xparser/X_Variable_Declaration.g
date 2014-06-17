tree grammar X_Variable_Declaration;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
  TokenLabelType = XToken;
}

@header {package dhbw.compilerbau.xparser; import java.util.Hashtable; }
@members { Hashtable variables = new Hashtable(); }


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
                
assignstat:     ^(ASSIGN ID expr) { if(!variables.containsKey($ID.text)) { System.out.println($ID.text + " is not declared!"); } };
                
expr:           term | (^(operator term term));

term:           INT | FLOAT | ID { if(!variables.containsKey($ID.text)) { System.out.println($ID.text + " is not declared!"); } } | STRING ;

operator:       '+' | '-' | '*'| '/';

comparator:     '<'|'>'|'=';

decl:           modifier ID  TYPE { variables.put($ID.text, $TYPE.text); };

modifier:       ('read' 'print' | 'read' | 'print')?;

