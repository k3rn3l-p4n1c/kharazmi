grammar Kharazmi;

prog: test;//block;

block: (statement NEWLINE)* END;

test: (expr_plus_boolean NEWLINE+)+;

statement:
      class_defenition
    | assignment_statement
    | instance_defenition
    | if_statement
    | while_statement
    | foreach_statement
    | method_defenition
    | return_statement
    | function_call
    | method_call
    ;

function_call:
    expr_id (WS WITH WS parameters)? DOT
    ;

method_call:
    expr_id COMMA WS expr_id (WS WITH WS parameters)? DOT
    ;

parameters:
    expr_id COLON WS expr_plus_boolean (WS AND WS id COLON WS expr_plus_boolean)*
    ;

instance_defenition:
    expr_id WS NEW WS expr_id WS POSTFIX_DEFINE (WS WITH WS parameters)? DOT
    ;

assignment_statement:
    expr_id WS EQUAL WS expr_plus_boolean WS POSTFIX_DEFINE DOT
    ;

if_statement:
    IF WS expr_plus_boolean WS COLON WS NEWLINE block ELSE block END
    ;

while_statement:
    WHILE WS expr_plus_boolean WS COLON WS NEWLINE block END
    ;

foreach_statement:
    FOREACH WS expr_id WS IN WS expr WS COLON WS NEWLINE block END
    ;

method_defenition:
    PREFIX_DEFINE WS expr_id (WS WITH WS expr_id (WS AND expr_id)*)? WS COLON WS NEWLINE block END
    ;

class_defenition:
    PREFIX_DEFINE CLASS WS expr_id COLON WS NEWLINE (class_statement NEWLINE)* END
    ;

class_statement:
      attributed_defenition
    | method_defenition
    ;

// to remove 'darad' from tokens ..
attributed_defenition: PREFIX_DEFINE WS expr_id;// HAS;

return_statement:
    RETURN ID
    ;

// TODO : AND priotry should be bigger than OR priotry
expr_plus_boolean:
       expr WS? boolean_operand WS? expr
      | expr_plus_boolean WS (OR | AND) WS expr_plus_boolean
      | expr
      ;

expr:
      id
    | NUMBER
    | STRING
    | '(' function_call ')'
    | '(' method_call ')'
//    | expr operand expr
    | '(' expr ')'
    ;

expr_id:
      id
    | '(' id ')'
    ;

id:
    (ID WS)* ID
    ;

// operand: ADD | MIN | MUL | SUB;

boolean_operand:
      LESS_THAN
    | GREATER_THAN
    | GREATER_THAN_OR_EQUAL
    | LESS_THAN_OR_EQUAL
    | EQUAL
    | NOT_EQUAL
    ;

// key words
POSTFIX_DEFINE: 'است' | 'اند' | 'هست' | 'هستند';
FALSE_POSTFIX_DEFINE: 'نیست' | 'نیستند';
PREFIX_DEFINE: 'تعریف';
CLASS: 'رسته';
IF: 'اگر';
ELSE: 'وگرنه';
WHILE: 'تا هنگامی که';
FOREACH: 'برای هر';
IN: 'در';
// HAS: 'دارد';
WITH: 'با';
AND: 'و';
OR: 'یا';
RETURN: 'بازمیگرداند' | 'برگردان';
END: 'خب';
NEW: 'یک';
EQUAL: 'برابر' | '==';
NOT_EQUAL: 'مخالف' | '!=';

DOT: '.';
COMMA: '،';
COLON: ':';

// operands
ADD: '+';
MIN: '-';
MUL: '*';
SUB: '/';

LESS_THAN: '<' | 'کوچک تر از';
GREATER_THAN: '>' | 'بزرگ تر از';
GREATER_THAN_OR_EQUAL: '>=' | 'بزرگ تر مساوی';
LESS_THAN_OR_EQUAL: '<=' | 'کوچک تر مساوی';


// identifires
ID: ('\u0620'..'\u06FF')+;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')* | ('1'..'9')('0'..'9')*;
STRING: '«' .+? '»';

NEWLINE: '\n';
WS: ' '+;
