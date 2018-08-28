/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passing_variables_to_methods;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Passing_Variables_to_methods {
    
    /// use  of ellipsis in the 

    void  sum (int... a)
     {
                  int sum=0;

         for(int aa:a)
             // Find out how and what this loop works
         {
                      sum +=aa;
         }
         System.out.println(sum);
         //return  sum;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter how many numbers will be provided");
        //int j=sc.nextInt();
       //  for(int i=0;i<j;i++)
        // {
        //     int [] kin = null;
       //     kin[i]=sc.nextInt();
       //  }
    Passing_Variables_to_methods psm=new Passing_Variables_to_methods();
    psm.sum(5,6,7,9);
    Scanner sc=new Scanner(System.in);
    //int [] arr = null;
        //System.out.println("How many numbers you want");
        //int dsrd=sc.nextInt();
       // for(int i=0;i<dsrd;i++)
        //{
            //arr=new int[i];
          //  System.out.println("Enter element");
            
            //arr[i]=sc.nextInt();
            
        //}
        //psm.sum(arr);
        // TODO code application logic here
    }
    
}
