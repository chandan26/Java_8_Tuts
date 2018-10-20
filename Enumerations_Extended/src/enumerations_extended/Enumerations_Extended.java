/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerations_extended;

/**
 *
 * @author Pycoder
 */
public class Enumerations_Extended {
    
    public enum days{
        Monday(1) {
            //****Implementation of the Abstract method for Monday Object******////
            @Override
            public void prompt_message() {
                System.out.println("Hey hurry up!!ITs Monday Start A fresh Week");

                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }, Tuesday(2) {
            
            //****Implementation of the Abstract method for Tuesday Object******////
            @Override
            public void prompt_message() {
                System.out.println("Two more days to go boy..Follow Your passion");
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        },Wednesday(3) {
            
            //****Implementation of the Abstract method for Monday Object******////
            @Override
            public void prompt_message() {
                System.out.println("One more to go Boy.......");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        },Friday(4) {
            //****Implementation of the Abstract method for Monday Object******////
            @Override
            public void prompt_message() {
                System.out.println("Last Working day  of the Weeek Check your Goal");

                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        private int day_num;
            days(int d)
                // This is a consructor and thus shoud have the same name as the class.
        {
                day_num=d;
                 System.out.println(" This is it!!!! this is day"+day_num+"");
            
        }
             public abstract void prompt_message();
             //  we can  have a abstract method inside a Enum class 
             ///  In this scenario it is only important to implement the 
             ///***ABSTRATCT Function for every ENUM object-********>
             
            
            
    }

    /**
     * @
     */
    public static void main(String[] args) {
        // 
        System.out.println(days.Monday);
        days da=days.Friday;
        da.prompt_message();
    }
    
}
