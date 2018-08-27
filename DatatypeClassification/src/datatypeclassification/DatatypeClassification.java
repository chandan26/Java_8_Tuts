/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypeclassification;

/**
 *
 * @author Administrator
 */
import java.util.*;
import java.io.*;
public class DatatypeClassification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scd=new Scanner(System.in);
        
         int t=scd.nextInt();
          for(int i=0;i<t;i++)
          {
              try {
                    long x=scd.nextLong();
                    scd.nextLine();
                    
                    if (x>=-128 && x<=127) 
                            {
                                System.out.println("*Byte");    
                              }
                    if(x>=-(Math.pow(2, 15))&& x<=(Math.pow(2, 15)))
                    {
                        System.out.println("*short");
                    }
                    if(x>=-(Math.pow(2, 31))&& x<=(Math.pow(2, 31)))
                    {
                        System.out.println("*int");
                    }
                     if(x>=-(Math.pow(2, 63))&& x<=(Math.pow(2, 63)))
                    {
                        System.out.println("*long");
                    }
                     System.out.println(x+"can be fitted in:");
                  
              } catch (Exception e)
              {
                  System.out.println(" Given number can not be fitted in any thing");
              }
              
              
          }
        
    }
    
}
