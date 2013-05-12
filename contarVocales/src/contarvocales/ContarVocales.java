/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contarvocales;

import java.io.*;
import java.lang.StringBuilder;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class ContarVocales {

    private static String FILE_NAME = "input.txt";
    private static int counterVocals;

    public ContarVocales() {

        counterVocals = 0;

    }

    public static void main(String[] args) {

        String data = "";
        String[] retriveData = {};
        ArrayList collectionData = new ArrayList();
        String currentString = "";
 
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
//------------------------------------------------------------------------------
// contamos las vocales

            for (int i = 0; i < collectionData.size(); i++) {

                currentString = collectionData.get(i).toString();

                for (int _index = 0; _index < currentString.length(); _index++) {

                    char _char = currentString.charAt(_index);

                    if (_char == 'a' || _char == 'e' || _char == 'i' || _char == 'o' || _char == 'u') {

                        counterVocals++;
                    }


                }
 

            }

//----------------------------------------------------------------------------
//imprimimos el resultado
            
            System.out.print("contiene " + counterVocals + " vocales ");

        } catch (Exception e) {
            
// cachamos el error
            
        } 
    }
}
