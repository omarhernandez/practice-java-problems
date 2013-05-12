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
    private ArrayList<Integer> collectionData = new ArrayList<Integer>();
//------------------------------------------------------------------------------    
// intentamos leer el archivo y manejamos los posibles errores
//------------------------------------------------------------------------------

    public void readFile() {

        String data = "";
        String[] retriveData = {};


        try {


            BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME_INPUT));

            int _counter;
            int _number;
            while ((data = bf.readLine()) != null) {//leemos una linea readLine del data.in

                retriveData = data.split(" ");
                _counter = 0;

                for (String number : retriveData) {

                    //cast a Entero
                    _number = Integer.parseInt(number);

                    // sumamos todos los numeros de la misma fila
                    _counter += _number;

                }

                collectionData.add(_counter);

            }


            writeFile();

        } catch (Exception e) {

// cachamos el error
            System.out.print("Hay un error al leer el archivo " + FILE_NAME_INPUT);

        }

    }

//------------------------------------------------------------------------------    
// BEGIN - intentamos Escribir el archivo 
//------------------------------------------------------------------------------
    public void writeFile() {
        BufferedWriter bw = null;

        try {
// intentamos leer el archivo y manejamos los posibles errores

            bw = new BufferedWriter(new FileWriter(FILE_NAME_OUTPUT));

            for (int index = 0; index < collectionData.size(); index++) {

                bw.write(String.valueOf(collectionData.get(index)));
                bw.write("\n");
            }



        } catch (Exception e) {
// cachamos el error

            System.out.print("Hay un error al escribir el archivo " + FILE_NAME_OUTPUT);

        } finally {
//limpiamos el error
            //Close the BufferedWriter
            try {
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }



    }
    //------------------------------------------------------------------------------    
// END - intentamos Escribir el archivo 
//------------------------------------------------------------------------------

    public static void main(String[] args) {

        new Suma().readFile();

    }
}
