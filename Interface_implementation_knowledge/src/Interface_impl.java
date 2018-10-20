
import java.util.Scanner;

/*
 * 
 */

/**
 *
 * @author Chandan
 */
public class Interface_impl {
    static void calcpayable_display( Banks b)
    {
        b.calcpayable();
        
    }
    public static void main(String[] args) {
        
        UBI u=new UBI();
        HDFC h=new HDFC();
        calcpayable_display(u);
        calcpayable_display(h);
        
        
    }
    
}

interface Banks
{
    void calcpayable();
    // interfaces can only have abstraact methods without any function body
   
    // an interface can extend another interface in a program
}
class  UBI implements Banks
{

    int Interestrate=12;
    public void calcpayable() {
        System.out.println(" The value  of interest to calculate the total payable is"+Interestrate);
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
class HDFC implements Banks
{
    int highrate=13;
    public void calcpayable()
    {
        
        System.out.println("Enter Value to calculate total payable");
        //int p   WE cant restrict the scope of a method more than the class in whic it is declared
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println("The Rate of interest from HDFC is " +(p+(p*highrate)));
        
    }
    
}