lexer grammar  PAGELexer;

fragment
 ID:[0-9]+;


 fragment
 SEA_WS
     :  (' '|'\t'|'\r'? '\n')*
     ;

fragment
CHAR: [a-zA-Z_];


fragment
VAR:[a-zA-Z]+;






STARTPAGE: SEA_WS? ('start' |'START') ->pushMode(START) ;







mode START;
 PAGE: SEA_WS ('page' | 'PAGE') SEA_WS->pushMode(DEFINATION_PAGE);
 CONTROLLER: SEA_WS 'controller' SEA_WS->pushMode(DEFINATION_CONTROLLER);
 CSS_PAGE: SEA_WS ('CSS'|'css') SEA_WS '{'SEA_WS ->pushMode(DEFINATION_CSS);







mode DEFINATION_CSS;
OBEN_CL:SEA_WS '{'SEA_WS->pushMode(Mose_css);
PATH: SEA_WS 'path' SEA_WS ':' SEA_WS;
CLASS_CSS: SEA_WS 'class' SEA_WS ':' SEA_WS;
NAME_CSS :[a-zA-Z]+;
CLOSE_CSS:SEA_WS '}'SEA_WS->popMode;




mode Mose_css;

CLOSE_CL:SEA_WS '}'SEA_WS->popMode;
COLOR:SEA_WS 'color'SEA_WS;
NUMBERING_M : SEA_WS ':' SEA_WS;
SEMICOLNE_M : SEA_WS ';' SEA_WS;
BACKGROUNG:SEA_WS 'background' SEA_WS;
PADDING :SEA_WS( 'padding' | 'padding-left'  | 'padding-right'   | 'padding-bottom' | 'padding-top') SEA_WS;
MARGINATE: SEA_WS ('margin'| 'margin-left'  | 'margin-right'   | 'margin-bottom' | 'margin-top') SEA_WS;
WIDTH:SEA_WS'width' SEA_WS;
HEIGHT:SEA_WS 'height' SEA_WS;
NUMBER_: [0-9]+;
 NUMBER__: ('px' |'%');
VALUE_COLOR :  ('#'[0-9A-Fa-f]+ |[a-zA-Z]+) ;

mode DEFINATION_CONTROLLER;

IF: SEA_WS ('if' |'elseif'|'else') SEA_WS->pushMode(BODY);
END_IF: SEA_WS'endif' SEA_WS;
GO : SEA_WS 'go' SEA_WS NAME_PAGE ID_PAGE SEA_WS  ';' SEA_WS ;
CONTROLS : SEA_WS 'controls' SEA_WS ;
ID_CONTROLLER:[0-9]+;
OPEN_CONTROLLER: SEA_WS '{' SEA_WS;
CLOSE_CONTROLLER: SEA_WS '}'  SEA_WS->popMode;
FOR:'for'SEA_WS->pushMode(BODY);
PRINT:'print'  SEA_WS ->pushMode(MODE_PRINT);
VARIABLE:('var' |'static'|'global') SEA_WS ->pushMode(MMM) ;
EQUAL_V:'=' SEA_WS ->pushMode(MODE_MM) ;
SEMICOLNE_V: SEA_WS ';' SEA_WS;
ARRAY:'array';
OBJECT:'object';
SWITCH:'switch';
COOKIES:'cookies';
JSON:'json';
NAME_CONTROLLER:(CHAR)+ ;
OBERATION_V: SEA_WS ('-'|'+'|'*'|'/') SEA_WS ->pushMode(MODE_MM);



mode MODE_PRINT;
OBEN_P: SEA_WS '(' SEA_WS;
STATMENT:(' '|'.'|'\\'|'/'|'&'|'='|'*'|'-'|'_'|'+'|'$'|'#'|'@'|'%'|'^'|[0-9]|[A-Za-z_])+;
CLOSE_P:SEA_WS ')' SEA_WS ';' SEA_WS ->popMode;



mode BODY;
VALID: SEA_WS  'valid' SEA_WS ->pushMode(MODE_VALID);
VAR_IF: (CHAR |ID )+ ;
OPERATION:  ('<' |'<=' |'>' |'>=' |'=='|'!=') ;
SPACE:(' ');
OBEN:SEA_WS'(' SEA_WS;
CLOSE:SEA_WS ')'SEA_WS->popMode;


mode MODE_VALID;
NAME_VALID: (CHAR |ID )+ ;
OBEN_VALID:SEA_WS'('SEA_WS  ;
CLOSE_VALID:SEA_WS')'SEA_WS ->popMode;
COMMA_VALID:SEA_WS  ',' SEA_WS ;



mode MODE_P;
OBEN_PR: SEA_WS '(' SEA_WS;
INSIDE_PR:(':'|';'|','|' '|'.'|'\\'|'/'|'&'|'='|'*'|'-'|'_'|'+'|'$'|'#'|'@'|'%'|'^'|[0-9]|[A-Za-z_])+;
CLOSE_PR: SEA_WS ')' SEA_WS  ';'SEA_WS->popMode;



 mode DEFINATION_PAGE;
 INPUT:  'input'   ->pushMode(INSIDDE);
 PRAGRAPH:'p' SEA_WS ':' SEA_WS ->pushMode(MODE_P);
  EXTENDS: SEA_WS 'extends' SEA_WS;
 OUTPUT: 'output'  ->pushMode(INSIDDE);
 ROW: 'row' SEA_WS->pushMode(MODE_TABLE);
 TABLE:'table' SEA_WS ':' SEA_WS->pushMode(MODE_TABLE);
 LIST:  'list' ->pushMode(LISTWEB);
 DATA:'data'->pushMode(INSIDDE);
 HEAD:SEA_WS 'head'SEA_WS->pushMode(HEAD_PAGE) ;
 NAME_PAGE:    (CHAR)+ ;
 ID_PAGE:[0-9]+ ;
 COMMA_PAGE: SEA_WS ',' SEA_WS;
 OPEN_BODY : SEA_WS'{' SEA_WS;
 CLOSE_BODY:'}' SEA_WS->popMode;
 LINK: SEA_WS 'link' SEA_WS ':' SEA_WS->pushMode(TAG_LINK);
SEMICOLNE_COLUM: SEA_WS';' SEA_WS;

mode MODE_TABLE;
OBEN_COLUMN:SEA_WS '(' SEA_WS;
NAME_COLUMN: (CHAR |ID |'.'|'@' )+ ;
COMMA_COLUMN: SEA_WS ',' SEA_WS;
CLOSE_COLUMN: SEA_WS ')' SEA_WS->popMode;

mode LISTWEB;
PARAGRAPH:(' '|'.'|'\\'|'/'|'&'|'='|'*'|'-'|'_'|'+'|'$'|'#'|'@'|'%'|'^'|[0-9]|[A-Za-z_])+;
CLOSE_LIST:SEA_WS ')'SEA_WS  ';' SEA_WS->popMode;
OBEN_LIST:SEA_WS ':' SEA_WS '('SEA_WS;
COMMA_LIST: SEA_WS ',' SEA_WS;

mode HEAD_PAGE;
 CSS:'css';
 SCRIPT:'script';
 EQUAL: SEA_WS '=' SEA_WS;
 NAME_TEXT:(ID|CHAR)+ ->popMode;

mode INSIDDE;

SESSION:'session' SEA_WS '(' SEA_WS->pushMode(ARRAY_SESSION);
CLASS: 'class'  ->pushMode(MODE_CLASS);
VALUE_OPTION:'value'  NUMBERING_MARK  ->pushMode(MMM);
NAME_OPTION:'name' NUMBERING_MARK  ->pushMode(MMM);
OPTION:'option' NUMBERING_MARK  SEA_WS '(';
SELECT:'select';
IMAGE : 'image'   ;
EXTENSTION: '.'CHAR+ ;
TEXT : 'text'  ;
NUMBERING_MARK: SEA_WS ':' SEA_WS;
FIELD:   'field'  ;
EMAIL:  'email'  ;
NUMBER:  'number'   ;
PASSWORD:  'password'   ;
DATE: 'date' ;
CHECKBOX: 'checkbox'  ;
RADIO: 'radio'  ;
FILE: 'file';
OBEN_NAME:SEA_WS'(' SEA_WS ->pushMode(MMM);
CLOSE_NAME:SEA_WS ')' SEA_WS;
COMMA: SEA_WS ',' SEA_WS;
SEMICOLNE :SEA_WS ';' SEA_WS -> popMode ;

mode ARRAY_SESSION;
ITEM:(CHAR |ID )+ ;
COMMA_S: SEA_WS ',' SEA_WS;
ASSIGNMENT :SEA_WS '=>'SEA_WS;
CLOSE_S:SEA_WS ')' SEA_WS->popMode;


mode MMM;
NAME:(CHAR |ID |'+'|'-'|'*'|'/'|'%')+ ->popMode;


mode MODE_MM;
NAME_V:(CHAR |ID )+ ->popMode;


mode MODE_CLASS;
OBEN_CLASS: SEA_WS '[' SEA_WS;
NAME_CLASS:(CHAR |ID|'-'|'_' )+;
COMMA_CLASS:SEA_WS ',' SEA_WS;
CLOSE_CLASS: SEA_WS ']' SEA_WS->popMode;


mode TAG_LINK;
HREF: SEA_WS  '"'  (CHAR)+ SEA_WS '"' SEA_WS->popMode;
NAME_LINK: SEA_WS (CHAR)+  ;



