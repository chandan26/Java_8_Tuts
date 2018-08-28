/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*******************************************************
Task 
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.


*************************************************************************/
package if_else.checker;

/**
 *
 * @author Administrator
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class If_elseChecker {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    if((N%2 == 0))
    {
        if(N<5) {
            System.out.println("Not Weird");
        }
        else if(6< N&& N < 20) {
             System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }          
        
    }
    else
        {
            System.out.println("Weird");
        }



        // TODO code application logic here
    }
    
}
