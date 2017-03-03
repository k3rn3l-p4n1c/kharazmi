grammar Kharazmi;

prog: block;

block: (statement DOT)* END;

statement:
      class_defenition
    | function_defenition
    | assignment_statement
    | instance_defenition
    | if_statement
    | while_statement
    | repeat_statement
    | foreach_statement
    | return_statement
    | expr
    | subjective_function_call
    ;

subjective_function_call:
    expr 'را' ID;

function_call:
    ID (arguments)?
    ;

method_call:
    ID ID (arguments)?
    ;

get_attr:
    ID KASRE ID;

arguments:
      WITH expr (AND WITH expr)* (AND WITH ID COLON expr)*
    | WITH ID COLON expr (AND WITH ID COLON expr)*
    ;


assignment_statement:
    ID EQUAL expr POSTFIX_DEFINE
    ;

instance_defenition:
    ID NEW expr POSTFIX_DEFINE
    ;

expr:
      ID
    | NUMBER
    | STRING
    | function_call
    | get_attr
    | method_call
    | expr operand expr
    | '(' expr ')'
    ;

operand: ADD | MIN | MUL | SUB |
            OR | AND |
            GT | LT | EQUAL;

class_defenition:
    CLASS ID COLON (class_statement DOT)* END
    ;

class_statement:
      attributed_defenition
    | method_defenition
    ;

attributed_defenition: ID HAS;

method_defenition:
    PREFIX_DEFINE ID (WITH parameters)? COLON block
    ;

function_defenition:
    FUNCTION ID (WITH parameters)? COLON block
    ;

parameters:
    ID (AND ID)*
    ;

if_statement:
    IF expr WAS COLON block ELSE block
    ;

while_statement:
    WHILE expr block
    ;

repeat_statement:
    expr 'بار' COLON block
    ;

foreach_statement:
    FOREACH ID IN expr COLON block
    ;

return_statement:
    RETURN ID
    ;


// key words
POSTFIX_DEFINE: 'است' | 'اند' | 'هست' | 'هستند';
PREFIX_DEFINE: 'تعریف';
WAS : 'بود' | 'باشد' | 'بودند' | 'باشند';
CLASS: 'رسته';
FUNCTION: 'تابع';
IF: 'اگر';
ELSE: 'وگرنه';
WHILE: 'تا هنگامی که';
FOREACH: 'برای هر';
IN: 'در';
HAS: 'دارد';
WITH: 'با';
RETURN: 'بازگردان';
END: 'خب';
NEW: 'یک';

AND: 'و';
OR: 'یا';
EQUAL: 'برابر' | 'مساوی' | '=';

GT: '>';
LT: '<';

DOT: '.';
COMMA: '،';
COLON: ':';
KASRE: 'ِ';

// operands
ADD: '+';
MIN: '-';
MUL: '*';
SUB: '/';

// identifires
ID: ('\u0620'..'\u06FF')+;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')* | ('1'..'9')('0'..'9')*;
STRING: '«' .+? '»';

//NEWLINE: '\n';
//WS: ' ';
