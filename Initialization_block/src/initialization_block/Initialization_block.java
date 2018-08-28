/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization_block;

/**
 *
 * @author Administrator
 */
public class Initialization_block {
    int x;
    static int v;
    
    static{
        System.out.println("Looping from Static initialization block");
        //***** The following line of code prompts a error as static  initialization block is called even if there is no object in the scene.*****////
        //**    x=10;    ***/
        v=10;
        //*** the abobve line of code does not prompt any error as the variable is declared as static previously***//
        
    }
    {
        System.out.println("Looping from Initilizer block");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Initialization_block in=new Initialization_block();
        
        // TODO code application logic here
    }
    
}
