package analizador;
import static analizador.Token.*;
%%                                      /*DEFINICIONES*/
%class Lexer                            /*LA CLASE QUE SE GENERARA SE LLAMA "LEXER" Y ESCRIBE CODIGO AHI*/
%type Token                             /*LOS VALORES SE RETORNAN DE TIPO "TOKEN" */
%line
%column
L = [a-zA-Z]                           
D = [0-9]
P = [(){}\[\]]
HEX = [0X|0x]
ENTER = [\n]
CARACT = [^\n]
WHITE = [ \t\r]*
VOID = ("void")
INT = ("int")
DOUBLE = ("double")
BOOL = ("bool")
STRING = ("string")
CLASS = ("class")
INTERFACE = ("interface")
NULL = ("null")
THIS = ("this")
EXTENDS = ("extends")
IMPLEMENTS = ("implements")
FOR = ("for")
WHILE = ("while")
IF = ("if")
ELSE = ("else")
RETURN = ("return")
BREAK = ("break")
NEW = ("New")
NEWARRAY = ("NewArray")
ENTEROHEX = 0[xX][0-9|a-f|A-F]+
ENTERODECIMAL = {D}+
CONSTBOOL = ("true"|"false")
STRINGA = (((\")[^\n]*(\")))
COMENTARIOS = ("//"[^\n]*)
COMENTARIOS2 = "/*" [^*] ~"*/"
ERRORCOMENTARIOS = "/*"~[^"*/"]
OPSUMA = ("+")
OPRESTA = ("-")
OPMULTI = ("*")
OPDIV = ("/")
OPPORCENTAJE = ("%")
OPMENORQUE = ("<")
OPMENORIGUAL = ("<=")
OPMAYORQUE = (">")
OPMAYORIGUAL = (">=")
OPIGUAL = ("=")
OPDOBLEIGUAL = ("==")
OPDIFERENTE = ("!=")
OPAND = ("&&")
OPOR = ("||")
OPADMIRACION = ("!")
OPPUNTOCOMA = (";")
OPCOMA = (",")
OPPUNTO = (".")
OPBRACKETIZQ = ("[")
OPBRACKETDER = ("]")
OPPARENTESISIZQ = ("(")
OPPARENTESISDER = (")")
OPCORCHETEIZQ = ("{")
OPCORCHETEDER = ("}")
OPBRACKETS = ("[]")
OPPARENTESIS = ("()")
OPCORCHETES = ("{}")
DOUBLENUM = {D}+("."){D}*([E|e]("+"))?{D}*
IDENTIFICADOR = {L}({L}|{D}|("_"))*

%{
public String lexeme;
%}
%%
{WHITE}                                                     {lexeme=yytext(); return T_WHITE;}
{ENTER}                                                     {lexeme=yytext(); return T_ENTER;}
{VOID}                                                      {lexeme=yytext(); return T_VOID;}
{INT}                                                       {lexeme=yytext(); return T_INT;}
{DOUBLE}                                                    {lexeme=yytext(); return T_DOUBLE;}
{BOOL}                                                      {lexeme=yytext(); return T_BOOL;}
{STRING}                                                    {lexeme=yytext(); return T_STRING;}
{CLASS}                                                     {lexeme=yytext(); return T_CLASS;}
{INTERFACE}                                                 {lexeme=yytext(); return T_INTERFACE;}
{NULL}                                                      {lexeme=yytext(); return T_NULL;}
{THIS}                                                      {lexeme=yytext(); return T_THIS;}
{EXTENDS}                                                   {lexeme=yytext(); return T_EXTENDS;}
{IMPLEMENTS}                                                {lexeme=yytext(); return T_IMPLEMENTS;}
{FOR}                                                       {lexeme=yytext(); return T_FOR;}
{WHILE}                                                     {lexeme=yytext(); return T_WHILE;}
{IF}                                                        {lexeme=yytext(); return T_IF;}
{ELSE}                                                      {lexeme=yytext(); return T_ELSE;}
{RETURN}                                                    {lexeme=yytext(); return T_RETURN;}
{BREAK}                                                     {lexeme=yytext(); return T_BREAK;}
{NEW}                                                       {lexeme=yytext(); return T_NEW;}
{NEWARRAY}                                                  {lexeme=yytext(); return T_NEWARRAY;}
{ENTERODECIMAL}                                             {lexeme=yytext(); return T_ENTERODECIMAL;}
{ENTEROHEX}                                                 {lexeme=yytext(); return T_ENTEROHEX;}
{CONSTBOOL}                                                 {lexeme=yytext(); return T_CONSTBOOL;}
{STRINGA}                                                   {lexeme=yytext(); return T_STRINGA;}
{COMENTARIOS}                                               {lexeme=yytext(); return T_COMENTARIOS;}
{COMENTARIOS2}                                              {lexeme=yytext(); return T_COMENTARIOS2;}
{ERRORCOMENTARIOS}                                          {lexeme=yytext(); return T_ERRORCOMENTARIOS;}
{OPSUMA}                                                    {lexeme=yytext(); return T_OPSUMA;}
{OPRESTA}                                                   {lexeme=yytext(); return T_OPRESTA;}
{OPMULTI}                                                   {lexeme=yytext(); return T_OPMULTI;}
{OPDIV}                                                     {lexeme=yytext(); return T_OPDIV;}
{OPPORCENTAJE}                                              {lexeme=yytext(); return T_OPPORCENTAJE;}
{OPMENORQUE}                                                {lexeme=yytext(); return T_OPMENORQUE;}
{OPMENORIGUAL}                                              {lexeme=yytext(); return T_OPMENORIGUAL;}
{OPMAYORQUE}                                                {lexeme=yytext(); return T_OPMAYORQUE;}
{OPMAYORIGUAL}                                              {lexeme=yytext(); return T_OPMAYORIGUAL;}
{OPIGUAL}                                                   {lexeme=yytext(); return T_IGUAL;}
{OPDOBLEIGUAL}                                              {lexeme=yytext(); return T_OPDOBLEIGUAL;}
{OPDIFERENTE}                                               {lexeme=yytext(); return T_OPDIFERENTE;}
{OPAND}                                                     {lexeme=yytext(); return T_OPAND;}
{OPOR}                                                      {lexeme=yytext(); return T_OPOR;}
{OPADMIRACION}                                              {lexeme=yytext(); return T_OPADMIRACION;}
{OPPUNTOCOMA}                                               {lexeme=yytext(); return T_OPPUNTOCOMA;}
{OPCOMA}                                                    {lexeme=yytext(); return T_OPCOMA;}
{OPPUNTO}                                                   {lexeme=yytext(); return T_OPPUNTO;}
{OPBRACKETIZQ}                                               {lexeme=yytext(); return T_OPBRACKETIZQ;}
{OPBRACKETDER}                                              {lexeme=yytext(); return T_OPBRACKETDER;}
{OPPARENTESISIZQ}                                           {lexeme=yytext(); return T_OPPARENTESISIZQ;}
{OPPARENTESISDER}                                           {lexeme=yytext(); return T_OPPARENTESISDER;}
{OPCORCHETEIZQ}                                             {lexeme=yytext(); return T_OPCORCHETEIZQ;}
{OPCORCHETEDER}                                             {lexeme=yytext(); return T_OPCORCHETEDER;}
{OPBRACKETS}                                                {lexeme=yytext(); return T_OPBRACKETS;}
{OPPARENTESIS}                                              {lexeme=yytext(); return T_OPPARENTESIS;}
{OPCORCHETES}                                               {lexeme=yytext(); return T_OPCORCHETES;}
{DOUBLENUM}                                                 {lexeme=yytext(); return T_DOUBLENUM;}
{IDENTIFICADOR}                                             {lexeme=yytext(); return T_IDENTIFICADOR;}

. {lexeme=yytext(); return ERROR;}
