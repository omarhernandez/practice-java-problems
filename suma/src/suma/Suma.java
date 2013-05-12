/*
Limite de tiempo : 0.5 seg.   Total runs : 1825  Aceptados : 607

Sumar a y b;La entrada y salida es mediante la lectura y escritura de archivos. 
Entrada (data.in):
Dos enteros separados por un espacio.

Salida (data.out):
Un entero que sea la suma de a y b.

Ejemplo:

Entrada:
10 10
12 12

Salida:
20
24
 */
package suma;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author omar
 */
public class Suma {
    
      private static String FILE_NAME_INPUT = "data.in";
      private static String FILE_NAME_OUTPUT = "data.out";
    
      public void readFile(){
     
        String data = "";
        String[] retriveData = {};
        ArrayList<Integer> collectionData = new ArrayList<Integer>();
 
        try {
            
// intentamos leer el archivo y manejamos los posibles errores
//------------------------------------------------------------------------------
// leer archivo para obtener el valor entero

            BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME_INPUT));
            
            int  counter;
            int _number;
            while ((data = bf.readLine()) != null) {//leemos una linea readLine del data.in
                
                retriveData = data.split(" ");
                counter = 0;
                
                for (String number : retriveData) {
                    
                    //cast a Entero
                    _number = Integer.parseInt(number);
                    
                    // sumamos todos los numeros de la misma fila
                    counter += _number; 
     
                }
   
                collectionData.add(counter);
 
            }
 
           
             System.out.print( collectionData.get(0)+"\n"+collectionData.get(1));
            
 
        } catch (Exception e) {
            
// cachamos el error
            System.out.print("Hay un error al leer el archivo "+FILE_NAME_INPUT);
            
        }
     
     }
 
    public static void main(String[] args) {
        
    	new Suma().readFile();
        
    }
}
