/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramtest;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Anagramtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sct=new Scanner(System.in);
        
        System.out.println("Enter First String");
        String str1=sct.next();
         System.out.println("Enter Second String");
         String str2=sct.next();
          if(str1.length()!=str2.length())
          {
              System.out.println("The strings "+str1+" and "+str2+" are not of same length");
          }
         boolean check= Anagramtestf.Anagramtestfunc(str1, str2);
         if(check==true)
         {
             System.out.println("Both the strings are anagram  for each other");
         }
         else
             System.out.println("Strings are not anagram for each other");
          
          
        // TODO code application logic here
    }
    
}
