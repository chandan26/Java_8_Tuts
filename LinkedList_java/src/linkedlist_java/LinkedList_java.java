/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_java;

/**
 *
 * @author  Pycoder
 */
import java.util.*;
public class LinkedList_java {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        LinkedList<String> l=new LinkedList<String>();
        l.add("one");
        l.add("two");
         l.add("Three");
        //l.addAll();
        l.addFirst("First");
        l.addLast("Last");
        l.push("Num");
        l.pop();// This method is helpful in poping an element from the linkedlist
        Iterator <String> it= l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        
        
        
        
        
    }
    
}

/*
Standard output
First
one
two
Three
Last
*/