/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pycoder
 */
public class Shape {
    void display()
    {
        System.out.println("From Shape constructor");
    }
    

    public static void main(String[] args) {
        System.out.println("Its main Class");
        Shape sh=new Shape();
         square sq=new square();
         rectangle rc=new rectangle();
         Circle cr=new Circle();
         sq.display();
         cr.display();
         rc.display();
        sh=cr;
        sh.display();
        
        
        
        /*
        
        Its main Class
From Square Class
From Circle Class
From rectangle class
From Circle Class
        
        */
    }
}
     class rectangle extends  Shape
     {
         void  display()
         {
             System.out.println("From rectangle class");
         }
      
     }
     class  square extends Shape
     {
         void display()
         {
             System.out.println("From Square Class");
         }
     }

     class  Circle extends Shape
     {
         void display()
         {
             System.out.println("From Circle Class");
         }
     }
/*
Standard output
without overriding 

Its main Class
From Square Class
From Circle Class
From rectangle class

*/
/*
After overriding 



*/
