/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Administrator
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Syntax of array ------->  Datatype [] arrayname 
        int [] arrq1;
        arrq1= new  int[5];
         Scanner sc= new Scanner(System.in);
         for(int j=0;j<5;j++)
         {
             System.out.println("Enetr the elements to be inserted in array");
             int k=sc.nextInt();
             arrq1[j]=k;
             
         }
         System.out.println("Displaying the elements");
         for(int h=0;h<(arrq1.length);h++)
         {
             System.out.println("Next element");
             System.out.println(arrq1[h]);
         }
    }
    
}
