/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextint_nextline_outputformatting;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nextint_nextline_OutputFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter a Integer");
        int i = scan.nextInt();
            //scan.nextLine();
            //   the empty scan.nextLine() consumes  the "\n" with the 
            System.out.println("Enter a Double Value");
        Double d=scan.nextDouble();
        scan.nextLine();
        //  The nextInt() method doesn’t read the new-line character "\n" inputted by user after pressing Enter at the end of the IO operation.  
        // Therefore it skips  the  nextline method as given in the 36th line  of the code.
        System.out.println("Enter a String");
        String s=scan.nextLine();
      
       

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
        // TODO code application logic here
  }
    

