/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_variables_methods;

/**
 *
 * @author Administrator
 */
public class Final_Variables_Methods {
    int k=15;
    final int x;
    {
        x=10;
        //** For a final variable declared in a class it should be intialized in the next constructor ele it will prompt in error
    }
    Final_Variables_Methods(){
       
        /// The following uncommented code may lead to erorr as we cant assign a value to the final declared variable.
        //x=50;
        
    }
    void show(final Final_Variables_Methods fv)
    {
        fv.k=25;
        System.out.println(fv.k);
        
        
    }
   static void display (final Final_Variables_Methods ds)
    //* For this method we have passed a refernce variable which is also a final  variable and 
    {
        
        ds.k=50;
        System.out.println("looping from Display Function");
        System.out.println(ds.k);
        //**can not be assigned to other object.
        //ds=new Final_Variables_Methods();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Final_Variables_Methods fdd=new Final_Variables_Methods();
        fdd.k=69;
        System.out.println("Value of k is now " +fdd.k);
        display(fdd);
        System.out.println("Value of variable after loooping "+fdd.k);
        
    }
    
}




//****Result of  the succeessfull compilation 
//Value of k is now 69
//looping from Display Function
//50
//Value of variable after loooping 50
