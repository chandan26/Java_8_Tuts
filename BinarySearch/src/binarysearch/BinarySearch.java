/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
import sun.security.tools.KeyStoreUtil;

/**
 * 
 * 
 * Binary search only works on only sorted arrays so  that the comparisons can be made between the elements.
 *
 * @author Administrator
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int n, bsrcharr[],first, last, middle;
            System.out.println("Enter the number of the elements yu want to store");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            bsrcharr=new int[n];
            for(int j=0;j<n;j++)
            {
                int elemnt;
                System.out.println("Enter elements in ascending order");
                elemnt=sc.nextInt();
                bsrcharr[j]=elemnt;
            }
               
            //for(int k=0;k<n;k++)
            //{
                System.out.println("enter elemnt to search");
            //}
            int searchelem=sc.nextInt();
            first=0;
            last=n-1;
            middle=(first+last)/2;
            while (first <=last)
            {
                                 if(bsrcharr[middle]<searchelem)
                                        {
                                         first=middle+1;
                                         }
                                 else if (bsrcharr[middle]== searchelem) 
                                 {
                                     System.out.println("Element Found");
                                        break;
                                   }
                                 else
                                 {
                                     last=middle-1;
                                     
                                 }
                                 
                            
                middle=(first+last)/2;
                
            }
                
            if(first>last)
            {
                System.out.println("Element not found");


            }
        


// TODO code application logic here
    }
    
}
