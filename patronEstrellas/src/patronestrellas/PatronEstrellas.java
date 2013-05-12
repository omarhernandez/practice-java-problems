/*
http://www.youtube.com/watch?v=nRvMqBl0bxc&list=PL29FDB1757C655811&index=1
 */
package patronestrellas;

/**
 *
 * @author omar
 */
public class PatronEstrellas {

    //-------------------------------------------------------
    public void graph() {

        String Asterics = "";
   
        for (int columns = 0; columns < 8; columns++) {

            for (int rows = 1; rows <= 16; rows++) {

                if (rows % 2 == 0) {

                    Asterics += " ";

                } else {
                    
                    Asterics += "*";
                }

            }
            
            if (columns % 2 == 0) {
              
                Asterics += "\n ";
           
            } else {
            
                Asterics += "\n";

            }
        }

        System.out.print(Asterics);


    }

//-------------------------------------------------------
    public static void main(String[] args) {

        PatronEstrellas obj = new PatronEstrellas();
        obj.graph();



    }
}
