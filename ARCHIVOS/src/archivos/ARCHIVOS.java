/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;

/**
 *
 * @author omar
 */
public class ARCHIVOS {

    private static String FILE_NAME = "archivo.txt";

    public static void main(String[] args) {


        File archivo = null;
        
        FileReader fr = null;
        
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(FILE_NAME);
            
            fr = new FileReader(archivo);
            
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;



            while ((linea = br.readLine()) != null) { //EOF

                System.out.println(linea + " ------ ");

            }
        } catch (Exception e) {
            
            e.printStackTrace();
            
        } finally {
            /* En el finally cerramos el archivo*/

            try {
                if (null != fr) {
                    
                    fr.close();
                    
                }
            } catch (Exception e2) {
                
                e2.printStackTrace();
                
            }
        }
    }
}
