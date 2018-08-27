/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_static_instantiaion;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Class_static_instantiaion {
    
    
     int f(int a, int  b)
    {
        
        
        return(a*b);
      //  return  4;
    }
     float f( float a, float b)
    
    {
         return (a+b);
    }
   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Method signature test
        Scanner sd=new Scanner(System.in);
        System.out.println("enter two floating value");
        float s=sd.nextFloat();
        float  v=sd.nextFloat();
       Class_static_instantiaion csdi=new Class_static_instantiaion();
       float sums=csdi.f(s,v);
       // System.out.println("enter two integer value");
        
    }
    
}
