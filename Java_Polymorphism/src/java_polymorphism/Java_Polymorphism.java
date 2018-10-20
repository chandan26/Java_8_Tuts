/*
 * 


 */
package java_polymorphism;

/**
 *
 * @author Pycoder
 */
public class Java_Polymorphism {
 // public   void show() ----*******------ this declaration  raises an error when it is tried to be overridden.
    void show()
   {


       System.out.println("From Java_polymorphism class");  
   }

    /**
     * When no access modifier is specified then, default access modifier are accessible only within the same package.
     * 
     */
    public static void main(String[] args) {
        
          asd a1=new asd();
          // The follwinig code will lead to error as the x is declared as private
          //--------->   a1.x=2;
          a1.y=120;
          System.out.println(a1.y);
          Java_Polymorphism jpf=new Java_Polymorphism();
          jpf.show();
          a1.show();
    }
    
}

class asd extends Java_Polymorphism
/* The above class  is declared with default access modifier.
        
        */
{
 private int x=20;
 int y=40;
asd()
 {
     System.out.println("From parameterless constructor asd class");
     
 }

 void show()
         //----*******------ Due to the above this like declaration it raises the error when we try to modify the access level.
{
    System.out.println("From (  show  )method");    
}
    
    
}


/*
standard output when executed


From parameterless constructor asd class------> as object of asd class is created first in main class.
120--->printed value of y changed in main class
From Java_polymorphism class----->method called from Java_polymorphism class
From (  show  )method-----> show method from asd class is called.
*/