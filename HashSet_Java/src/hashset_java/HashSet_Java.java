/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset_java;
import java.util.*;

/**
 *
 * @author Pycoder
 */
public class HashSet_Java {

    /**
     *  
     * One can not name a class as resreved datastructure in java such as below one;
     * public class HashSet{}
     */
    public static void main(String[] args) {
        HashSet <String> hstr=new HashSet<>();
         String nam=" This is java program a a test for hashet that has a  class in java";
         StringTokenizer stk=new StringTokenizer(nam, " ");
         
         while (stk.hasMoreTokens()) 
                {
                        String tok=stk.nextToken();
                        hstr.add(tok);
            
                }
         System.out.println("Number  of Unique Tokens are " +hstr.size());
         System.out.println(hstr);
        
        
        
        
    }
    
}
