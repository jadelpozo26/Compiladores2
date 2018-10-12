/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;


import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author jadel
 */
public class NMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
            String path = "C:\\Users\\jadel\\Desktop\\prueba.frag";
            File file=new File(path);
            String ubicacion = file.getAbsolutePath();
            String[] archivoPrueba = {ubicacion};
            parser.main(archivoPrueba);
            System.out.println("Ejecutado!");
    }
    
}
