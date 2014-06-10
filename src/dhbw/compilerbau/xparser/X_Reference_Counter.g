tree grammar X_Reference_Counter;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}

@header {package dhbw.compilerbau.xparser;
         import java.util.Hashtable;}
@members { public int num_assignments = 0; 
           public Hashtable references = new Hashtable();
          }


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
                
assignstat:     ^(ASSIGN id=ID expr) {num_assignments++; 
                                      if(references.containsKey($id)) { references.put($id,1+(int)references.get($id)); }
                                      else { references.put($id,1);  }    };
                
expr:           term | (^(operator term term));

term:           INT | FLOAT | ID  | STRING;

operator:       '+' | '-' | '*'| '/';

comparator:     '<'|'>'|'=';

decl:           modifier ID  TYPE;

modifier:       ('read' 'print' | 'read' | 'print')?;

