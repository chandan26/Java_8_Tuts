/*
 * 



 */
package java_charfrequency;

import java.util.Scanner;

/**
 *
 * @author Chandan
 */
public class Java_charfrequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter some string value");
        String name=sc.next();
        System.out.println("Enter the Charecter yo want to find");
        char srch=sc.next().charAt(0);
        /* The following code is for getting a single  char input from the user using the scanner class */
        int count=0;
        for (int i = 0; i <= name.length()-1; i++) {
             if((name.charAt(i)==(srch)))
             {
                 count++;
                 
             }
             
              


            
        }
        System.out.println(" the number of times "+srch+" is "+count);
    }
    
}
