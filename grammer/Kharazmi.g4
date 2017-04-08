grammar Kharazmi;

prog: block;

block: (statement DOT)* END;

statement:
      classDefinition
    | functionDefinition
    | assignmentStatement
    | instanceDefinition
    | ifStatement
    | whileStatement
    | repeatStatement
    | foreachStatement
    | returnStatement
    | expr
    | subjectiveFunctionCall
    ;

subjectiveFunctionCall:
    expr 'را' ID;

functionCall:
    ID (arguments)?
    ;

methodCall:
    ID ID (arguments)?
    ;

getAttr:
    ID KASRE ID;

arguments:
      WITH expr (AND WITH expr)* (AND WITH ID COLON expr)*
    | WITH ID COLON expr (AND WITH ID COLON expr)*
    ;


assignmentStatement:
    ID EQUAL expr POSTFIX_DEFINE
    ;

instanceDefinition:
    ID NEW expr POSTFIX_DEFINE
    ;

expr returns[String type, Object value]:
      ID
    | NUMBER
    | STRING
    | functionCall
    | getAttr
    | methodCall
    | expr operand expr
    | '(' expr ')'
    ;

operand: ADD | MIN | MUL | SUB |
            OR | AND |
            GT | LT | EQUAL;

classDefinition:
    CLASS ID COLON (classStatement DOT)* END
    ;

classStatement:
      attributedDefinition
    | methodDefinition
    ;

attributedDefinition: ID HAS;

methodDefinition:
    PREFIX_DEFINE ID (WITH parameters)? COLON block
    ;

functionDefinition:
    FUNCTION ID (WITH parameters)? COLON block
    ;

parameters:
    ID (AND ID)*
    ;

ifStatement:
    IF expr WAS COLON block ELSE block
    ;

whileStatement:
    WHILE expr block
    ;

repeatStatement:
    expr 'بار' COLON block
    ;

foreachStatement:
    FOREACH ID IN expr COLON block
    ;

returnStatement:
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
WS : [ \t\r\n]+ -> skip ;
