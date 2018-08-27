/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author Administrator
 */



/* Covered COnstructors, Constructor overloading and  passing variables to constrctors */
public class Constructors {

     int c,k,n;
     public void ckn()
     {
         System.out.println(c*k*n);
     }

    Constructors() {
        System.out.println("Constructor without a parameter");
    }

   Constructors(int c, int k, int n) {
        this.c = c;
        this.k = k;
        this.n = n;
        System.out.println("Constructors with three parameters " +(c*k*n));
    }
   Constructors(int a,int b)
   {
       System.out.println("Constructors with two parameters "+(a*b));
       
   }
   ///********* When We use a return type with a constrctor then it becomes a method for the class***////
   //****Following is a Example of a method with same name of class as constructors but with return type******////
   int Constructors(int a, int b  , int c,int d)
   {
       System.out.println(a*b*c*d);
       return (a*b*c*d);
   }
   
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructors conos=new Constructors(20,150);
        //** Constrauctor with two parametrs 
        Constructors con=new Constructors(20,15,0);
        //*** COnstructr with two parametrs 
        Constructors cons=new Constructors();
        //***The above is a parameter lesss construcor
        Constructors cont=new Constructors();
        cont.Constructors(25, 1,2, 1);
    }
    
}
//Following is the Result of the Constructors and Method calls.

/**
Constructors with two parameters 3000
Constructors with three parameters 0
Constructor without a parameter
Constructor without a parameter
50
*/
