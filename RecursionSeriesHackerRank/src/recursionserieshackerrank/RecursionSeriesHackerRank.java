/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionserieshackerrank;

import static java.lang.Math.pow;
import java.util.Scanner;
import  java.math.*;

/**
 *
 * @author Administrator
 */
public class RecursionSeriesHackerRank {
    
    public static int Reseries(int a,int b,int n)
    {
       int sum = a;
        
        for(int g=0;g<=(n-1);g++)
         {
             int nelm=(int) ((b*(Math.pow(2, g))));
             //int inelm=(int) ((b*(Math.pow(2, (g-1)))));
             sum+=nelm;
                     //+inelm;
             
             //sum=(int) ((a+(b*(Math.pow(2,n))))+(b*(Math.pow(2,n-1))));
             System.out.print(sum);
             System.out.print("\t");
         }
       // return 0;
       //System.out.println(sum);
       return 0;
        
      
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of series you want");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter value of a");
            int a = in.nextInt();
             System.out.println("Enter value of b");
            int b = in.nextInt();
             System.out.println("Enter value of n");
            int n = in.nextInt();
            Reseries(a, b, n);
            System.out.print("\n");
        }
        
        // TODO code application logic here
        
    }
    
}
