/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Administrator
 */

public class Polymorphism {
    
    
    void show(int a)
{
    System.out.println("Method with single int");
}
    void show(int q, float b)
    {
        System.out.println("with a int and a Float");
    }
    void show(int a, int b)
    {
        System.out.println("With two integers");
    }
    void show(double d, double l)
    {
        System.out.println("With two doubles");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Polymorphism plm=new Polymorphism();
       plm.show(1);
     //  plm.show(2.3,3.4);
     plm.show(1, 11);
     plm.show(25.22,55.11);
    }

    //private void show(double d, double d0) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
    
}
