/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternery.operator;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TerneryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,  k;
        boolean j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for ternary opertaor test");
        i=sc.nextInt();
        j=(i>10)?true:false;
        System.out.println(j);
        // TODO code application logic here
    }
    
}
