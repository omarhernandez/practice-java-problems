/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

/**
 *
 * @author omar
 */
public class Order {

    private String[] weekdays = 
    {"Sun", "Mon", "Tue", "Thu", "Fri", "Sat"};

    public static void main(String[] args) {
  
       Order obj = new Order();
       
        
        int data = Integer.parseInt(args[0]);
        
        System.out.println(data+1);
        
        System.out.println(obj.weekdays.length);
        
        for (String s : args)
            System.out.println("year : " + s);
    }
}
