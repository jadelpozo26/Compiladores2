
package analizador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TablaSimbolos {
    
    String nombre;
    String tipo;
    String valor;
    int bandera;
    int clases;
    int bparametro;
    
    
    public TablaSimbolos(String Nombre, String Tipo, String Valor, int Bandera, int Clases, int BParametro )
    {
       
        nombre=Nombre;
        tipo=Tipo;
        valor=Valor;
        bandera=Bandera;
        clases=Clases;
        bparametro = BParametro;
                
    }
    public Boolean VerificarVariable(String ID, List<TablaSimbolos> ListaSimbolos, int cont)
    {
        
       
        for (int i = 0; i < ListaSimbolos.size(); i++) {
            
            if (ListaSimbolos.get(i).clases==cont) {
                if(ListaSimbolos.get(i).bandera == 1)
                {
                    if (ListaSimbolos.get(i).nombre.equals(ID) ) 
                    {
                        return true;
                    }
                    
                }
                
            }
            
        }
        return false;
        
    }
    
    public Boolean VerificarClase(String ID, List<TablaSimbolos> ListaSimbolos)
    {
        
       
         for (int i = 0; i < ListaSimbolos.size(); i++) {
            
            
                if (ListaSimbolos.get(i).nombre.equals(ID) && ListaSimbolos.get(i).bandera==4) {
                    return true;
                }
          
           
        }
        return false;
        
    }
    
    public Boolean VerificarFuncion(String ID, List<TablaSimbolos> ListaSimbolos, int cont)
    {
        
         for (int i = 0; i < ListaSimbolos.size(); i++) {
            
            if (ListaSimbolos.get(i).clases==cont) {
                if(ListaSimbolos.get(i).bandera == 2)
                {
                    if (ListaSimbolos.get(i).nombre.equals(ID) ) 
                    {
                        return true;
                    }
                    
                }
                
            }
            
           
        }
        return false;
    }
    public void InsertarVariable(String ID, List<TablaSimbolos> ListaTemporal,int cont1,int cont)
    {
        
        for (int i = 0; i < ListaTemporal.size(); i++) {
            if (ListaTemporal.get(i).nombre.equals(ID)) {
                TablaSimbolos Tabla =new TablaSimbolos(ListaTemporal.get(i).nombre,ListaTemporal.get(i).tipo,"",cont1,cont,0);
                ListaTemporal.set(i, Tabla);
            }
        }
    }
    
    
    public void Escribir(List<TablaSimbolos> ListaSimbolos) throws IOException
  {
//      String sFichero = "Tabla de Simbolos.txt";
//      File fichero = new File(sFichero);
//      
//      if(fichero.exists())
//      {
//          BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
//          
//          for (int x=0;x<ListaSimbolos.size();x++)
//          {
//              bw.write(ListaSimbolos.get(x).tipo + " " + ListaSimbolos.get(x).nombre + " " +
//              ListaSimbolos.get(x).valor + ListaSimbolos.get(x).clases); 
//         }
//           
//      }
      int x;
      
      x= ListaSimbolos.size() -1 ;
      FileWriter fichero = null;
      PrintWriter pw = null;
      
      fichero = new FileWriter("Tabla de Simbolos.txt", true);
      pw = new PrintWriter(fichero);
      
      pw.println(ListaSimbolos.get(x).tipo + "  | " + ListaSimbolos.get(x).nombre + "   | " +
             ListaSimbolos.get(x).valor + "   | " + ListaSimbolos.get(x).bandera + "    | " +ListaSimbolos.get(x).clases);
      
      if(null != fichero)
      {
          fichero.close();
      }
  }
  
    
}
