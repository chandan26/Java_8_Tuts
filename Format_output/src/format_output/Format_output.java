/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* Problem  Descrition*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer. 
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================


*/
package format_output;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Format_output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                System.out.println("Enter a String");
                String s1=sc.next();
                System.out.println("Enter a integer");
                int x=sc.nextInt();
                 
                {
                    System.out.printf( "%-15s",s1);
                    System.out.printf( " %03d \n",x);
                    
                    
                }
                //Complete this line
                
            }
            System.out.println("================================");
        
        
        
        // TODO code application logic here
    }
    
}
