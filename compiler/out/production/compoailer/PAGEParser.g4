parser grammar PAGEParser;

options { tokenVocab=PAGELexer; }



/*###########################      LANGUAGE     ##################################*/

language: start ;

start:STARTPAGE ((page)  (back_end)* )+  css_page?;




/*###########################      PAGE     ##################################*/
page : (defination_page);
defination_page:(  PAGE  name_page  head* body ) ;
name_page: NAME_PAGE  ID_PAGE (EXTENDS ID_PAGE(COMMA_PAGE ID_PAGE)*)?;
body: OPEN_BODY   inside*  CLOSE_BODY ;
head:HEAD (css|script) ;
css:CSS EQUAL NAME_TEXT;
script:SCRIPT EQUAL NAME_TEXT;

inside:(input |output|link|table|list|data|pragraph);
pragraph:PRAGRAPH  OBEN_PR INSIDE_PR? CLOSE_PR    ;
list:LIST  OBEN_LIST PARAGRAPH ( COMMA_LIST PARAGRAPH)*  CLOSE_LIST  ;
link:LINK  NAME_LINK HREF;
table:head_table;
head_table:TABLE  OBEN_COLUMN  column  CLOSE_COLUMN  row*  SEMICOLNE_COLUM;
column:NAME_COLUMN (COMMA_COLUMN NAME_COLUMN )*;
row: ROW OBEN_COLUMN  column  CLOSE_COLUMN ;
output:(OUTPUT NUMBERING_MARK type_OUT name_out class_?  SEMICOLNE ) ;
input:(INPUT  NUMBERING_MARK (type_IN name | select name option+)   class_? SEMICOLNE) ;
type_IN:FIELD|EMAIL |NUMBER|PASSWORD|DATE|CHECKBOX|RADIO|FILE|TEXT;
select:SELECT;

type_OUT:TEXT|FILE|(IMAGE );
class_:CLASS OBEN_CLASS  NAME_CLASS (COMMA_CLASS NAME_CLASS)* CLOSE_CLASS;
class_table:CLASSTABLE NUMBERING_MARK NAME (COMMA NAME)*;
name:OBEN_NAME NAME CLOSE_NAME;
name_out:OBEN_NAME NAME EXTENSTION? CLOSE_NAME ;
option:OPTION  NAME_OPTION  NAME  CLOSE_NAME;
data:DATA  NUMBERING_MARK (seesion);
seesion:SESSION    array_s CLOSE_S SEMICOLNE ;
array_s:item  (COMMA_S item)* ;
item:ITEM ASSIGNMENT ITEM;


/*###########################      CONTROLLER     ##################################*/
back_end:defnation_controller;
defnation_controller: CONTROLLER name_controller  CONTROLS  name_controller_page controller ;
name_controller: NAME_CONTROLLER ID_CONTROLLER;
name_controller_page:NAME_CONTROLLER ID_CONTROLLER;


controller:OPEN_CONTROLLER body_controller* (GO )? CLOSE_CONTROLLER;
body_controller:(if_body |for_body|print_php|variable) ;
if_body:IF OBEN condition CLOSE body_controller* (GO )? END_IF  ;
condition: (VAR_IF SPACE* OPERATION  SPACE* VAR_IF| VALID OBEN_VALID NAME_VALID( COMMA_VALID NAME_VALID)* CLOSE_VALID );
for_body: FOR OBEN CLOSE;
print_php:PRINT  OBEN_P STATMENT CLOSE_P;
variable :VARIABLE NAME  (EQUAL_V NAME_V | EQUAL_V NAME_V   OBERATION_V   NAME_V )? SEMICOLNE_V;







/* ############################            CSS               #####################################*/


css_page:CSS_PAGE  body_css* CLOSE_CSS;
body_css:PATH NAME_CSS CLASS_CSS NAME_CSS OBEN_CL  body_class* CLOSE_CL;
body_class:COLOR NUMBERING_M VALUE_COLOR SEMICOLNE_M
            |BACKGROUNG NUMBERING_M VALUE_COLOR SEMICOLNE_M
            |PADDING  NUMBERING_M NUMBER_ NUMBER__ SEMICOLNE_M |
            MARGINATE  NUMBERING_M NUMBER_ NUMBER__  SEMICOLNE_M
            |WIDTH  NUMBERING_M NUMBER_ NUMBER__ SEMICOLNE_M
            |HEIGHT NUMBERING_M NUMBER_ NUMBER__  SEMICOLNE_M ;
















