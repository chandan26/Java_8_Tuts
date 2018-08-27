/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors_passing_objects;

/**
 *
 * @author Administrator
 */
public class Constructors_Passing_Objects {
     int c=0,k=0,n=0,s=0,su=0;

     Constructors_Passing_Objects() {
    }
     public void calcvolume()
     {
         System.out.println(s*su*n*k*c);
     }
     Constructors_Passing_Objects(Constructors_Passing_Objects m)
             
             //**** The above is the Constructor in wich we are passing the Constructors_Passing_Objects type  m  ****///  
     {
         System.out.println("looping from Constructor with object");

         this.k=m.k;
         this.c=m.c;
         this.n=m.n;
         this.su=m.su;
         this.s=m.s;
         
     }
     Constructors_Passing_Objects(int c, int k, int n, int s, int su){

            this.k=k;
         this.c=c;
         this.n=n;
         this.su=su;
         this.s=s;         
     }
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructors_Passing_Objects cdk=new Constructors_Passing_Objects(10,5,1,1,2);
        //*****Calling the Constructor****// 
        cdk.calcvolume();
        //**Calling the calcvol function**//
        cdk.n=25;
        //**Changing the value of n to modify the constructor value
        Constructors_Passing_Objects ccd=new Constructors_Passing_Objects(cdk);
        ccd.calcvolume();
        //**Calling the calcvol function**//
        
    }
    
}
