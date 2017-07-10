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
    expr 'را' ID DOT
    | expr 'را' PRINT_FUNCTION DOT;

functionCall:
    ID (arguments)? DOT
    | PRINT_FUNCTION (arguments)? DOT;

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

expr returns[String type, Object value, boolean isID]:
    functionCall
    | getAttr
    | methodCall
    | expr ADD term
    | expr SUB term
    | expr OR term
    | expr compare_operation term
    | term;

term returns[String type, Object value, boolean isID]:
    term MUL factor
    | term DIV factor
    | term AND factor
    | factor;

factor returns[String type, Object value, boolean isID]:
    TRUE
    | FALSE
    | ID
    | NUMBER
    | STRING
    | '(' expr ')';

compare_operation: GT | LT | EQUAL | GT_EQUAL | LT_EQUAL;

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
    ifBlock (elseBlock)? END
    ;

ifBlock: ifHead block;

elseBlock:
    ELSE COLON block
    ;

ifHead:
    IF expr WAS COLON
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

GT_EQUAL: '=<' | '<=' | 'بزرگتر مساوی' | 'بزرگترمساوی';
LT_EQUAL: '=>' | '>=' | 'کوچکتر مساوی' | 'کوچکترمساوی';

DOT: '.';
COMMA: '،';
COLON: ':';
KASRE: 'ِ';

// operands
ADD: 'به علاوه' | '+';
SUB: 'منهای' | 'منها ی';
MUL: 'ضربدر' | 'ضرب در' | '*';
DIV: 'تقسیم بر' | 'بخش بر';

REPEAT: 'بار';
PRINT_FUNCTION: 'چاپکن' | 'چاپ کن';

// identifires
ID: ('\u0620'..'\u06EF')('\u0620'..'\u06FF' | '‌' | '0'..'9')*;
NUMBER: ('\u06F1'.. '\u06F9')('\u06F0'.. '\u06F9')* | ('1'..'9')('0'..'9')*;
STRING: '«' .+? '»' | '»' .+? '«';
TRUE: 'درست';
FALSE: 'غلط' | 'نادرست' | 'نا درست';

//NEWLINE: '\n';
//WS: ' ';
//WS : [ \t\r\n]+ -> skip ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
