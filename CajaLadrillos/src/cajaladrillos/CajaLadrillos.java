/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaladrillos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class CajaLadrillos {

    private static String FILE_NAME_INPUT = "data.in";
    private int[] collectionData;
    private int k;
    int _max_height_;
    int moviments;

    public void readFile() {


        k = 0;
        moviments = 0;
        String data = "";
        String[] retriveData = {};


        try {

// intentamos leer el archivo y manejamos los posibles errores
//------------------------------------------------------------------------------
// leer archivo para obtener el valor entero

            BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME_INPUT));

            _max_height_ = 0;
            int _number;

            int n = Integer.parseInt(bf.readLine()); // numero de columnas
            collectionData = new int[n]; //coleccion de datos

            data = bf.readLine();
            retriveData = data.split(" ");

            int i = 0;


            for (String number : retriveData) {

                //cast a Entero
                _number = Integer.parseInt(number);

                collectionData[i] = _number;
                // sumamos todos los numeros de la misma fila
                _max_height_ += _number;
                i++;
            }

            //@_max_height_   numero maximo de bloque (altura)
            _max_height_ = _max_height_ / n;

            nivelarAltura(0);
            // k = k /2;
            //minimo de movimientos posibles para niverlar


            System.out.println("The minimum number of moves is " + k);
        } catch (Exception e) {

// cachamos el error
            System.out.print("Hay un error al leer el archivo " + FILE_NAME_INPUT);

        }

    }

    public void nivelarAltura(int current_index) {

        //nivelando la altura       

        for (int index = current_index; index < collectionData.length; index++) {

            if (collectionData[index] > _max_height_) {



                moviments++;
                collectionData[index] -= 1;

                nivelarAltura(index);

            } else {

                if (collectionData[index] < _max_height_) {
                    k++;
                    moviments--;
                    collectionData[index] += 1;

                    nivelarAltura(index);

                }

            }


        }


    }

    public static void main(String[] args) {
        // TODO code application logic here
        new CajaLadrillos().readFile();
    }
}
