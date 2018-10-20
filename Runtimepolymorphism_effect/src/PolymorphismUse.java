/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PolymorphismUse {
    
    
     static void show( Bank bnk)
     {
         bnk.getInterset();
         
         
     }
    
    public static void main(String[] args) {
        
    
        
        SBI sb=new SBI();
        Axis ax=new Axis();
        ax.getInterest();
        sb.getInterest();
        
    }

   
}

  class Bank {
                        // in order to declare a abstract class uncomment the following code line
                         //abstract class Bank {

                         // abstract void getInterset() ----> uncomment this line for making the method 
                         //abstract void getInterset();
             void getInterset() 
                // comment this line for abstract class
                // ALWAYS REMEMBER ABSTRACT METHOD DOES NOT HAVE ANY BODY JUST METHOD NAME methodname();
             {
          System.out.println("Interest rate 12%");
        
     }
    }

class  SBI extends  Bank
{
    void getInterest()
    {
        System.out.println(" Rate of interest is 10%");
    }
}
 class  UBI extends Bank
 {
    void getInterest()
    {
        System.out.println(" Rate of interest is 12%");
    } 
 }
class  Axis extends Bank
 {
    void getInterest()
    {
        System.out.println(" Rate of interest is 12%");
    } 
 }

