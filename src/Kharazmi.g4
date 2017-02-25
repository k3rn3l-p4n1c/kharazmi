grammar Kharazmi;

prog: (statement NEWLINE)*;

statement:
    variable_defenition
    | class_defenition
    | if_statement
    | while_statement
    | foreach_statement;

variable_defenition: ID ID DEFINE;

class_defenition: CLASS ;
if_statement: IF;
while_statement: WHILE;
foreach_statement: FOREACH;

ID: ('\u0600'..'\u06FF')+;
DEFINE: 'است';
CLASS: 'رسته';
IF: 'اگر';
WHILE: 'تا هنگامی که';
FOREACH: 'برای هر';

NEWLINE: '\n';