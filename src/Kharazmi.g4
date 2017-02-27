grammar Kharazmi;

prog: test;//block;

block: (statement NEWLINE)* END;

test: function_call;

statement:
    | class_defenition
    | assignment_statement
    | instance_defenition
    | if_statement
    | while_statement
    | foreach_statement
    | return_statement
    | function_call
    | method_call
    ;

//function_call:
//    expr 'را' ID;

function_call:
    id (WS WITH WS parameters)? DOT
    ;

method_call:
    id COMMA WS id (WS WITH WS parameters)? DOT
    ;

parameters:
    id COLON WS expr (WS AND WS id COLON WS expr)*
    ;

assignment_statement:
    ID EQUAL expr POSTFIX_DEFINE
    ;

instance_defenition:
    ID NEW expr POSTFIX_DEFINE
    ;

expr:
    | id
    | NUMBER
    | STRING
    | '(' function_call ')'
    | '(' method_call ')'
//    | expr operand expr
    | '(' expr ')'
    ;

operand: ADD | MIN | MUL | SUB;

class_defenition:
    CLASS ID COLON (class_statement NEWLINE)* END
    ;

class_statement:
    | attributed_defenition
    | method_defenition
    ;

attributed_defenition: ID HAS;
method_defenition:
    PREFIX_DEFINE ID COLON (WITH ID (AND ID)*)? block
    ;

if_statement:
    IF expr block ELSE block
    ;

while_statement:
    WHILE expr block
    ;

foreach_statement:
    FOREACH ID IN expr block
    ;

return_statement:
    RETURN ID
    ;

id:
    (ID WS+)* ID
    ;

// key words
POSTFIX_DEFINE: 'است' | 'اند' | 'هست' | 'هستند';
PREFIX_DEFINE: 'تعریف';
CLASS: 'رسته';
IF: 'اگر';
ELSE: 'وگرنه';
WHILE: 'تا هنگامی که';
FOREACH: 'برای هر';
IN: 'در';
HAS: 'دارد';
WITH: 'با';
AND: 'و';
RETURN: 'بازمیگرداند';
END: 'خب';
NEW: 'یک';
EQUAL: 'برابر';

DOT: '.';
COMMA: '،';
COLON: ':';

// operands
ADD: '+';
MIN: '-';
MUL: '*';
SUB: '/';

// identifires
ID: ('\u0620'..'\u06FF')+;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')* | ('1'..'9')('0'..'9')*;
STRING: '«' .+? '»';

NEWLINE: '\n';
WS: ' ';
