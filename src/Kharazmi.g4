grammar Kharazmi;

prog: statement*;

statement:
    variable_defenition;

variable_defenition: ID ID 'است';

ID: ('\u0600'..'\u06FF')+;