/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author omar
 */
public class Name {

    String ASTERISC = "*";
    String name;
    StringBuilder nameWithAsterisc;
    int numberCharString;

    public Name(String name) {

        this.name = name;
        this.nameWithAsterisc = new StringBuilder();
        this.numberCharString = name.length();
    }
//--------------------------------------------------

    public void appendAsterisc() {

        for (int i = 0; i < numberCharString + 2; i++) {

            nameWithAsterisc.append(ASTERISC);

        }

    }
//--------------------------------------------------

    public void drawName() {

        appendAsterisc();
        nameWithAsterisc.append("\n*");
        nameWithAsterisc.append(name);
        nameWithAsterisc.append("*");
        nameWithAsterisc.append("\n");
        appendAsterisc();
        System.out.print(nameWithAsterisc);

    }

//--------------------------------------------------  
    public static void main(String[] args) {

        String args_name = "";

        try {

            args_name = args[0];
            
            Name init_name = new Name(args_name);

            init_name.drawName();

        } catch (Exception e) {

            System.out.print("No hay datos en linea de Comandos\n");
       
        } finally {
       
        }


    }
}
