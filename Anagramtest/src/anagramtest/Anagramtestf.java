/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramtest;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Anagramtestf {
    String s1;
    String s2;
    public static  boolean Anagramtestfunc(String s, String str)
    {
        
        // converting  the strings into char arrays.
        char [] arr1=s.toLowerCase().toCharArray();
        char [] arr2=str.toLowerCase().toCharArray();
        //sorting the char array  in order to 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         boolean stat=Arrays.equals(arr1, arr2);
         return stat;
        
        
    }
    
    
    
}
