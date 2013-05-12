/*
http://teddy.itc.mx/problemas.php
 */
package fibonacci;

/**
 *
 * @author omar
 */
public class Fibonacci {

//------------------------------------------------------
    public void drawSerie(int range) {

        String serie = "0,";

        int a = 0, b = 1, c = 0;

        for (int i = 0; i < range; i++) {
          
            c = a + b;
            a = b;
            b = c;

            serie += a + ",";
        }

        System.out.print(serie);

    }

//------------------------------------------------------
    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();

        fib.drawSerie(Integer.parseInt(args[0]));

    }
}
