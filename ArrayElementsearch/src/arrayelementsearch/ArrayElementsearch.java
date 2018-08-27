/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayelementsearch;

/**
 *
 * @author Administrator
 */
import java.awt.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
//import java.util.stream.Collectors.joining;
//import java.util.stream.Collectors.to


        //import java
         //       import java
public class ArrayElementsearch {
    

    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
         Scanner sc=new Scanner(System.in);
         
         
         int [] arrq1;
        arrq1= new  int[5];
         //Scanner sc= new Scanner(System.in);
         for(int j=0;j<5;j++)
         {
             System.out.println("Enetr the elements to be inserted in array");
             int k=sc.nextInt();
             arrq1[j]=k;
             
         }
        System.out.println("Enter the element to search");
        int se=sc.nextInt();
        for (int g=0;g<arrq1.length;g++)
        {
            if(se==arrq1[g])
            {
                System.out.println(se+" element is found at " + (g+1) +" position");
                // As the 
                break;
            }
            //else
                ///System.out.println("Element not found");
        }
        // TODO code application logic here
    }
    
}
