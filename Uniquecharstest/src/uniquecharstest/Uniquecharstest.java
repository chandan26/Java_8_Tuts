/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquecharstest;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Uniquecharstest {
     public static boolean uniquechartestwoDS(String str)
     {
         if(str.length()>256)
        {
            return false;
            
        }
          boolean[] charset=new  boolean[256];// creating a array  of boolean values afetr inserting charecters from the string.
//          Example of boolean array.
//          b[0] = true;
//        b[1] = false;
//        b[2] = false;
//        b[3] = false;
          for(int i=0;i<str.length();i++)
          {
              int count=str.charAt(i);
              // inserting in the
              if(charset[count])
              {
                  System.out.println("Does nothave unique charecters");
                  return  false;
                  
              }
              charset[count]=true;
              
          
              
          }
          System.out.println("Have all unique carecters");
          
          return true;
         
     }
     public static void uniquecharwDS(String str)
     {
         
         boolean match= false;
         HashSet <Character> unique=new HashSet();
         for(int j=0;j<str.length();j++)
         {
             match=unique.add(str.charAt(j));
             if(match==false)
                  break;
             // Break the loop when there is a next match for same charecter
              
         }
         if(match==true)
         {
             //printing the result when there are no matches for a specific chraecter in the given string
             System.out.println("All the charecters are unique");
         }
         else
             System.out.println(" The string does not have unique charecters");
         
         
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scd=new Scanner(System.in);
        System.out.println("Enter The string!!!");
        String sct=scd.next();
         //The following commented function for unique charecters is with out using any extra data structre.
            
                                //uniquechartestwoDS(sct);
            
                     //use the above one when we need to use function with out data structure. 
                     // This following function is using Hashset  that only adds unique elements from the string in the set.
        
                            //uniquecharwDS(sct);
                            
                     // to use the function with a extra datastructure use the above one. 
        
        
    }
    
    
    
}
