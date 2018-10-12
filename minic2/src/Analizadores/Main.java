/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.io.File;


/**
 *
 * @author jadel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String path = "C:\\Users\\jadel\\Desktop\\Compiladores2\\minic2\\src\\Analizadores\\A_Lexico.jflex";
        String path2 = "C:\\Users\\jadel\\Desktop\\Compiladores2-master\\src\\analizador\\Sintactico.cup";
        generarLexer(path, path2);
       

    }
    public static void generarLexer(String path, String path2){
        File file=new File(path);
        File file2=new File(path);
        jflex.Main.generate(file);
    }
        
    }
    

    

