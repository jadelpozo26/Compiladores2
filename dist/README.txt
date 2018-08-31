ARCHIVO README

El programa le dara 4 opciones distribuidas en 4 botones:

Buscar .Flex: el cual abre un buscador de archivos en el cual debera elegir el archivo .flex que quiera generar.

Generar Lexer: el cual genera un archivo Lexer.java basado en el archivo .flex elegido anteriormente.

Buscar Archivo: el cual abre un buscador de archivos en el cual debera elegir el arhivo que quiere analizar con el analizador léxico.

Analizar: hace que el programa analice el archivo elegido anteriormente y genera una salida en la carpeta del proyecto con el mismo nombre del archivo de entrada pero .out

El programa funciona correctamente porque hace todas las validaciones indicadas en el enunciado
y reconoce los diferentes errores.

El programa reconoce 3 tipos de errores:

1. Cuando el simbolo no es parte de las palabras reservadas o de los operadores tirra "error simbolo no valido".
2. Cuando se inicia un comentario pero no se cierra dice "error no esta cerrado el comentario" y por ende todo lo que le sigue al inicio del comentario ya no lo reconoce.
3. Cuando un identificador es mayor a 31 caracteres el programa trunca el indentificador a 31 caracteres y devuelve "error el identificador fue truncado".


