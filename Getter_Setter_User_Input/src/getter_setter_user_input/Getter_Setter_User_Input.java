/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getter_setter_user_input;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Getter_Setter_User_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Scanner sc=new Scanner(System.in);
        Customer_class csl=new Customer_class();
                int wgtval=sc.nextInt();
                csl.setWeight(wgtval);

        System.out.println(csl.getWeight());
        
    }
    
}
