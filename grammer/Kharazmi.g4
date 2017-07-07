grammar Kharazmi;

prog: block EOF;

block: (statement)*;

statement:
      classDefinition
    | functionDefinition
    | assignmentStatement
    | instanceDefinition
    | ifStatement
    | whileStatement
    | repeatStatement
    | foreachStatement
    | returnStatement // TODO: remove, blocks outside functions cannot return something.
    | functionCall
//    | getAttr
    | methodCall
    | subjectiveFunctionCall
    ;

subjectiveFunctionCall:
      expr 'را' ID DOT;

functionCall:
    ID (arguments)? DOT
    ;

methodCall:
    ID ID (arguments)? DOT
    ;

getAttr:
    ID KASRE ID;

arguments:
      WITH expr (AND WITH expr)* (AND WITH ID COLON expr)*
    | WITH ID COLON expr (AND WITH ID COLON expr)*
    ;


assignmentStatement:
    ID EQUAL expr POSTFIX_DEFINE DOT
    ;

instanceDefinition:
    ID NEW expr POSTFIX_DEFINE DOT
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
    CLASS ID COLON (classStatement)* END
    ;

classStatement:
      attributedDefinition
    | methodDefinition
    ;

attributedDefinition: ID HAS DOT;

methodDefinition:
    PREFIX_DEFINE ID (WITH parameters)? COLON block END
    ;

functionDefinition:
    FUNCTION ID (WITH parameters)? COLON block END
    ;

parameters:
    ID (AND ID)*
    ;

ifStatement:
    IF expr WAS COLON block (ELSE COLON block)? END
    ;

whileStatement:
    WHILE expr block END
    ;

repeatStatement:
    expr REPEAT COLON block END
    ;

foreachStatement:
    FOREACH ID IN expr COLON block END
    ;

returnStatement:
    RETURN ID DOT
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

GT: '<' | 'بزرگتر';
LT: '>' | 'کوچکتر';

DOT: '.';
COMMA: '،';
COLON: ':';
KASRE: 'ِ';

// operands
ADD: '+';
MIN: '-';
MUL: '*';
SUB: '/';

REPEAT: 'بار';

// identifires
ID: ('\u0620'..'\u06EF')('\u0620'..'\u06FF' | '‌' | '0'..'9')*;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')* | ('1'..'9')('0'..'9')*;
STRING: '«' STRING_VALUE '»' | '»' STRING_VALUE '«';
STRING_VALUE: .+?;

//NEWLINE: '\n';
//WS: ' ';
//WS : [ \t\r\n]+ -> skip ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
