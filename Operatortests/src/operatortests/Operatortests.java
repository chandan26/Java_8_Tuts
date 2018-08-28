/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatortests;

/**
 *
 * @author Administrator
 */
public class Operatortests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a=10;
         int b=45;
         System.out.println(a);
         System.out.println(a++);
         System.out.println(a);
         System.out.println(++a);//Increases the value of the variable before hand and prints  the value. 
         // the above logic  is same for the ++ and -- opertaors. 
         System.out.println(--b);
         System.out.println(b--);
         System.out.println(b);
         System.out.println(~b);//~ bit wise complement---->  generates the minus of total positve value starting from 0.
          for(int k=1;k<100;)
              // simialarly valid loops are 
              //for(int k=1;;k++)
              //for(int k=1;k++;)
              //infinite loop for(;;)
               // Diffrence between the while and do while loop is
              // do while loop executes at least once before the condition checking
          {
              System.out.println(k);
          }
    }
    
}
