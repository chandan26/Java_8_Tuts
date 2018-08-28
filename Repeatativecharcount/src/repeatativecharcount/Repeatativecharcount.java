/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatativecharcount;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Repeatativecharcount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scrt=new  Scanner(System.in);
         String strcom=scrt.next();
         System.out.println("your entered dstring is " + strcom);
       // StringBuffer concat=new StringBuffer();
        //char[] arrchar=strcom.toCharArray();
       //
        Repeattest.repeatst(strcom);
        
    }
    
}
