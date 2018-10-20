/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass_java;

/**
 *
 * @author Pycoder
 */
public class InnerClass_Java {
    
    
     int x=10;
     static  int val=25;
     private int num=15;
      static  class nestedinner
      {
           // This is a  static inner class and can only acees static members of the outer class.
          void show()
          {
              System.out.println(" the Value  of static member of the outer class is"+ val);
              //System.out.println(x);
              
              // The above code result into prompting an error. as we have declared  the innner class as static and 
              // using the 
          }
      }

      
      class nestedinnertwo
      {
          
          // Non static   innner clases are known as member classes.
          private  int iy=10;
           void display()
           {
               System.out.println(" accessing the private memebr  of  outer class and  the value is "+num);
                // this inner class is accessing the prvate member of the outer class. 
                //Thus using the innner it is possiblbe to get access to private and protected memebers of outerclass.
           }
      }

    /**
     * 
     */
    public static void main(String[] args) {
        
        InnerClass_Java in=new InnerClass_Java();
       in.num=20;
       InnerClass_Java.nestedinnertwo insttwo=in.new nestedinnertwo();
// This is another way of instantiating a object
       
        InnerClass_Java.nestedinner innes=new InnerClass_Java.nestedinner();
        innes.show(); // the innes  is the object of the 
        InnerClass_Java obj=new InnerClass_Java();
        

        // TODO code application logic here
        // Types of  Innner classes
        //--->Inner Class
        //---->Method-local Inner Class
        //----->Anonymous Inner Class
    }
    
}
