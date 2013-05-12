/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package separarletrasarchivo;

import java.io.*;
import java.lang.StringBuilder;
import java.util.ArrayList;



/**
 *
 * @author omar
 */
public class SepararLetrasArchivo {

    
    private static String FILE_NAME = "input.txt";
    private static String VOCALS = "aeiou";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String data = "";
        String[] retriveData = {};
        ArrayList thisArrayList = new ArrayList();


        try {
// intentamos la ejecucion

            // se crea el archivo para guardar el valor entero
            //FileOutputStream fos = new FileOutputStream(FILE_NAME,true);
            //fos.write(10);

            // se abre el archivo para sacar el valor entero

            BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME));
        
            
            while ((data = bf.readLine()) != null) {


                retriveData = data.split(" ");

                for (String numer : retriveData) {

                    thisArrayList.add(numer);
                }


            }

            for (int i = 0; i < thisArrayList.size(); i++) {
                System.out.print(thisArrayList.get(i) + " ");
            }
 
            
        } catch (Exception e) {
// cachamos el error
        } finally {
//limpiamos el error
        }
    }
}
