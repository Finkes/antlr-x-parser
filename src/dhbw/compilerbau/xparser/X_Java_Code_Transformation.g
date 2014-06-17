tree grammar X_Java_Code_Transformation;

options {
  language = Java;
  output = template;
  tokenVocab = X;
  ASTLabelType = CommonTree;
  TokenLabelType = XToken;
}

@header {package dhbw.compilerbau.xparser; }
@members { 

int num_assignments = 0; 


public StringTemplate buildTemplate(String s) 
{
	StringTemplate template = new StringTemplate("Hello, <name>");
	return template;
}

}


program :       ^('program' ID (decls += decllist)* block)
                -> template(id={$ID.text}, dec = {$decls}) 
<<
public class <id> {
  <dec; separator="\n">
}
>>;

decllist:       ^(DECLARE decl) -> template(x = {$decl.st}) "<x>";    
                   
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

decl:           modifier ID  TYPE -> template(x={$ID}, y = {$TYPE}, mod = {$modifier.st})"<y> <x> <mod>;";


modifier: ;
//modifier:       ('read' 'print' ->  template()" = System.in.read()";
            //| 'read' -> template(x={buildTemplate('')})"<x>"
            //| 'print' -> template()"")?;
           

