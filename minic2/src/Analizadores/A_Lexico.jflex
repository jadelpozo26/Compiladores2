/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;
import java.util.LinkedList;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>(); 
%}

//-------> Directivas
%public 
%class Analizador_Lexico
%cup
%char
%column
%full
%line
%unicode
L = [a-zA-Z]                           
D = [0-9]
P = [(){}\[\]]
D2 = [1-9]
HEX = [0X|0x]
ENTER = [\n]
CARACT = [^\n]
WHITE = [ \t\r\n]
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
PRINT = ("Print")
READINTEGER = ("ReadInteger")
READLINE = ("ReadLine")
MALLOC = ("Malloc")
FOR = ("for")
WHILE = ("while")
IF = ("if")
ELSE = ("else")
RETURN = ("return")
BREAK = ("break")
NEW = ("New")
GETBYTE = ("getbyte")
SETBYTE = ("setbyte")
NEWARRAY = ("NewArray")
ENTEROHEX = 0[xX][0-9|a-f|A-F]+
ENTERODECIMAL = {D}+
CONSTBOOL = ("true"|"false")
STRINGA = (((\")[^\n]*(\")))
COMENTARIOS = ("//"[^\n]*)
COMENTARIOS2 = "/*"~"*/"
ERRORCOMENTARIOS = "/*"[^"*/"]*
OPSUMA = ("+")
OPRESTA = ("-")
OPRESTAN = ("-")
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
DOUBLENUM = {D}+("."){D}*([E|e]?[+-]?{D}+)?
IDENTIFICADOR = {L}({L}|{D}|("_"))*


%%
<YYINITIAL>
{
{WHITE}                                                     {/*Ignore*/}
{ENTER}                                                     {}
{VOID}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_VOID, yycolumn, yyline, yytext());}
{INT}                                                       {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_INT, yycolumn, yyline, yytext());}
{DOUBLE}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_DOUBLE, yycolumn, yyline, yytext());}
{BOOL}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_BOOL, yycolumn, yyline, yytext());}
{STRING}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_STRING, yycolumn, yyline, yytext());}
{CLASS}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_CLASS, yycolumn, yyline, yytext());}
{INTERFACE}                                                 {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_INTERFACE, yycolumn, yyline, yytext());}
{PRINT}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_PRINT, yycolumn, yyline, yytext());}
{READINTEGER}                                               {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_READINTEGER, yycolumn, yyline, yytext());}
{READLINE}                                                  {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_READLINE, yycolumn, yyline, yytext());}
{MALLOC}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_MALLOC, yycolumn, yyline, yytext());}
{NULL}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_NULL, yycolumn, yyline, yytext());}
{THIS}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_THIS, yycolumn, yyline, yytext());}
{EXTENDS}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_EXTENDS, yycolumn, yyline, yytext());}
{IMPLEMENTS}                                                {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_IMPLEMENTS, yycolumn, yyline, yytext());}
{FOR}                                                       {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_FOR, yycolumn, yyline, yytext());}
{WHILE}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_WHILE, yycolumn, yyline, yytext());}
{IF}                                                        {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_IF, yycolumn, yyline, yytext());}
{ELSE}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_ELSE, yycolumn, yyline, yytext());}
{RETURN}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_RETURN, yycolumn, yyline, yytext());}
{BREAK}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_BREAK, yycolumn, yyline, yytext());}
{NEW}                                                       {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_NEW, yycolumn, yyline, yytext());}
{NEWARRAY}                                                  {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_NEWARRAY, yycolumn, yyline, yytext());}
{ENTERODECIMAL}                                             {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_ENTERODECIMAL, yycolumn, yyline, yytext());}
{ENTEROHEX}                                                 {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_ENTEROHEX, yycolumn, yyline, yytext());}
{CONSTBOOL}                                                 {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_CONSTBOOL, yycolumn, yyline, yytext());}
{STRINGA}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_STRINGA, yycolumn, yyline, yytext());}
{COMENTARIOS}                                               {}
{COMENTARIOS2}                                              {}
{ERRORCOMENTARIOS}                                          {}
{OPSUMA}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPSUMA, yycolumn, yyline, yytext());}
{OPRESTA}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPRESTA, yycolumn, yyline, yytext());}
{OPRESTAN}                                                  {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPRESTAN, yycolumn, yyline, yytext());}
{OPMULTI}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPMULTI, yycolumn, yyline, yytext());}
{OPDIV}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPDIV, yycolumn, yyline, yytext());}
{OPPORCENTAJE}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPORCENTAJE, yycolumn, yyline, yytext());}
{OPMENORQUE}                                                {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPMENORQUE, yycolumn, yyline, yytext());}
{OPMENORIGUAL}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPMENORIGUAL, yycolumn, yyline, yytext());}
{OPMAYORQUE}                                                {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPMAYORQUE, yycolumn, yyline, yytext());}
{OPMAYORIGUAL}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPMAYORIGUAL, yycolumn, yyline, yytext());}
{OPIGUAL}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_IGUAL, yycolumn, yyline, yytext());}
{OPDOBLEIGUAL}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPDOBLEIGUAL, yycolumn, yyline, yytext());}
{OPDIFERENTE}                                               {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPDIFERENTE, yycolumn, yyline, yytext());}
{OPAND}                                                     {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPAND, yycolumn, yyline, yytext());}
{OPOR}                                                      {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPOR, yycolumn, yyline, yytext());}
{OPADMIRACION}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPADMIRACION, yycolumn, yyline, yytext());}
{OPPUNTOCOMA}                                               {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPUNTOCOMA, yycolumn, yyline, yytext());}
{OPCOMA}                                                    {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPCOMA, yycolumn, yyline, yytext());}
{OPPUNTO}                                                   {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPUNTO, yycolumn, yyline, yytext());}
{OPBRACKETIZQ}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPBRACKETIZQ, yycolumn, yyline, yytext());}
{OPBRACKETDER}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPBRACKETDER, yycolumn, yyline, yytext());}
{OPPARENTESISIZQ}                                           {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPARENTESISIZQ, yycolumn, yyline, yytext());}
{OPPARENTESISDER}                                           {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPARENTESISDER, yycolumn, yyline, yytext());}
{OPCORCHETEIZQ}                                             {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPCORCHETES, yycolumn, yyline, yytext());}
{OPCORCHETEDER}                                             {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPCORCHETEDER, yycolumn, yyline, yytext());}
{OPBRACKETS}                                                {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPBRACKETS, yycolumn, yyline, yytext());}
{OPPARENTESIS}                                              {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPPARENTESIS, yycolumn, yyline, yytext());}
{OPCORCHETES}                                               {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_OPCORCHETES, yycolumn, yyline, yytext());}
{DOUBLENUM}                                                 {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_DOUBLENUM, yycolumn, yyline, yytext());}
{IDENTIFICADOR}                                             {System.out.print(yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.T_IDENTIFICADOR, yycolumn, yyline, yytext());}
}
. {System.out.print("ERROR" + yytext()+ "\t\t\tLinea" + yyline + "\n"); return new Symbol(sym.ERROR, yycolumn, yyline, yytext());}