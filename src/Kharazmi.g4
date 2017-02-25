grammar Kharazmi;

prog: (statement NEWLINE)*;

statement:
    | class_defenition
    | assignment_statement
    | if_statement
    | while_statement
    | foreach_statement
    ;


assignment_statement:
    ID expr DEFINE
    ;

expr:
    | ID
    | NUMBER
    | expr operand expr
    ;

operand: ADD | MIN | MUL | SUB;

class_defenition: CLASS ;
if_statement: IF;
while_statement: WHILE;
foreach_statement: FOREACH;

// key words
DEFINE: 'است';
CLASS: 'رسته';
IF: 'اگر';
WHILE: 'تا هنگامی که';
FOREACH: 'برای هر';

// operands
ADD: '+';
MIN: '-';
MUL: '*';
SUB: '/';

// identifires
ID: ('\u0600'..'\u06FF')+;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')*;

NEWLINE: '\n';