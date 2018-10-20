/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerations_java;

/**
 *
 * @author Pycoder 
 */
public class Enumerations_java {

    public enum offical_day{
    // the enum  classes are implicitly static and final.
        
    Monday, Tuesday, wednesday, thursday, friday;
    }
    /**
     * @Enumertaions in java 
     *  
     * 
     * It extends java.lang.Enum
     * can contain field, method as well as constructors 
     */
    public static void main(String[] args) {
        System.out.println(" Today is "+ offical_day.friday);
        offical_day today=offical_day.wednesday;
        if(today==offical_day.friday)
        {
             System.out.println(" this is a friday weekend");
        }
        else{
             System.out.println(" This is not a friday weekend.");
        }
    }
    
}
