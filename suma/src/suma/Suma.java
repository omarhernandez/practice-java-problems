/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.io.*;
import java.lang.StringBuilder;
import java.util.ArrayList;
/**
 *
 * @author omar
 */
public class Suma {
    
      private static String FILE_NAME = "input.txt";

     public void readFile(){
     
            String data = "";
        String[] retriveData = {};
        ArrayList collectionData = new ArrayList();
 
        try {
            
// intentamos leer el archivo y manejamos los posibles errores
//------------------------------------------------------------------------------
// leer archivo para obtener el valor entero

            BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME));


            while ((data = bf.readLine()) != null) {


                retriveData = data.split(" ");

                for (String numer : retriveData) {

                    collectionData.add(numer);
                }


            }
 

        } catch (Exception e) {
            
// cachamos el error
            System.out.print("Hay un error al leer el archivo "+FILE_NAME);
            
        }
     
     }
 
    public static void main(String[] args) {
        
    	new Suma().readFile();
        
    }
}
