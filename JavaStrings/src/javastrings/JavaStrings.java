/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastrings;

/**
 *
 * @author Chandan Prasad (Pycoder)
 */
public class JavaStrings {

    /** Properties
     * 
     * 
     * 
     * 
     * Strings in  the java is immutable 
     *  It means once a object of string  class is created it cannot be modified 
     * when ever we try to modify the previous object, a new object is created in the memory.
     */
    public static void main(String[] args) {
        // TSring pool is maintained by the java compiler  in order to manage string literals.
        
        
        /*
        java String class methods
        Java String Methods
        
        
        String charAt()
        
        String compareTo()
        
        String concat()
        
        String contains()
        
        String endsWith()
        
        String equals()
        
        equalsIgnoreCase()
        
        String format()
        
        String getBytes()
        
        String getChars()
        
        String indexOf()
        
        String intern()
        
        String isEmpty()
        
        String join()
        
        String lastIndexOf()
        
        String length()
        
        String replace()
        
        String replaceAll()
        
        String split()
        
        String startsWith()
        
        String substring()
        
        String toCharArray()
        
        String toLowerCase()
        
        String toUpperCase
        
        String trim()-----> Method eliminates leading and trailing spaces.
        
        String valueOf()
        
        
        
        */
        
        String s2="  Being yourself   ";  /* Notice the string has spaces at the beigning and trailing of it and not the spaces in between */
        System.out.println(" The string afetr using the trim method is"+s2.trim());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        String s1= "name";
        String s3="Name";
        System.out.println(s1.equalsIgnoreCase(s3));
        String lov= "Ye jo Name h";
        int indchar=lov.indexOf("Y");
        
        System.out.println(" the position of the search content is "+indchar);
        
         
        
        
    }
    
}
