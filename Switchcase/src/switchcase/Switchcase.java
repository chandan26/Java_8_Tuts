/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int choice;
       
        do {  
             System.out.println("1. To perform addition");
        System.out.println("2. To perform subtraction");
        System.out.println("3. To perform multiplication");
        System.out.println("Enetr Your choices");
        choice= sc.nextInt();
            
        
        switch(choice)
        {
            case 1:
                System.out.println("Enter first number");
                int a=sc.nextInt();
                int b= sc.nextInt();
                int sum=a+b;
                System.out.println("Result of  Addition "+sum);
                break;
            case 2: 
                System.out.println("Enter first number");
                int a1=sc.nextInt();
                int b1= sc.nextInt();
                int sum1=a1-b1;
                System.out.println("Result of  Substraction "+sum1);
                break;
            case 3:
              System.out.println("Enter first number");
                int a2=sc.nextInt();
                int b2= sc.nextInt();
                int smul=a2*b2;
                System.out.println("Result of  Multiplication is "+smul);
                break;
             default:
                 System.out.println("wrong choice");
                
        }
        } while (choice<0 || choice>5);
        
    }
    
}
