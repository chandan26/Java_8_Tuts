/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pycoder
 */
public class multiple_interfaces implements intr_one,inter_two{
    
    public static void main(String[] args) {
        
    }

    @Override
    public void manage() {
        throw new UnsupportedOperationException("Not supported yet."); 
                //To change body of generated methods, choose Tools | Templates.
                // while implementng interfaces through a class in netbans it will prompt a warning/error.
                //The solution for this is using the error which will ask for implmenting all  the abstract methods
    }

    @Override
    public void calc() {
        throw new UnsupportedOperationException("Not supported yet."); 
                    //To change body of generated methods, choose Tools | Templates.
    }
    
}
 interface  intr_one
 {
     //int rate;
      // Any variable deaclared in interface should be initiaized as
     // all variables declared in the interface automatically become public static final
     int rates=25;
     void manage();
     //{
         // We should not use  the curly braces for a method body  inside a interface.
     //}
 }
 interface  inter_two
 {
     void calc();
     default void  DisplayInterest()
     {
         System.out.println(" This is from the Default method of interface two");
     }
 }
