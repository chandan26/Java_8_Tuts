/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Objective 
In this challenge, we're going to use loops to help us do some simple math.

Task 
Given an integer, N , print its first  multiples. Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

Input Format

A single integer,2<=N<=10 .

Constraints

Output Format

Print  lines of output; each line  (where 1<=i<=10 ) contains the  of  in the form: 
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
package looping.in.java;
import  java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author Administrator
 */
public class LoopingInJava {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        
        int N = scanner.nextInt();
        int i=1;
        int p;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int j=1;j<=10;j++)
        {
        p=N*j;
        System.out.println(N+"*"+j+"="+p);
        }
        scanner.close();
    }
    
}
