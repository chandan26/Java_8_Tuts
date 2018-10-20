/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorclass;
import java.util.Vector;


/**
 *
 * @author Administrator
 */
public class Vectorclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector vv= new  Vector();
        Vector v= new  Vector();
        v.add("FlyHigh");  
        v.add(1);
            v.add(2);
              v.add(3);
              v.add(5);
              // As the  vector class  is a arraylist like  data structure.Thus it stores data  in a continuous way.
              //List Interface. Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment.
              //As it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.
              /*Follwinig are the  most commonly used methods with vector class
              */
              
              
                //        v.add(v);
                //        v.add(0, v);
                //        v.addAll(v);
                //        v.addAll(0, v);
                //        v.addElement(v);
                
                
        v.capacity();
        
                        //        System.out.println(v.capacity());
                        //        v.clear();
                        //        v.containsAll(v);
                        //        v.copyInto(args);
                        //        v.contains(v);
                        //        v.elementAt(0);
                        //        v.elements();
                        //        v.ensureCapacity(0);
                        //        v.firstElement();
                        //       v.hashCode();
                        //       v.hashCode();
                        //       v.indexOf(v);
                        //       v.insertElementAt(v, 0);
                        //       v.isEmpty();
                        //       v.iterator();
                        //       v.lastElement();
                        //       v.lastIndexOf(v);
                        //       v.lastIndexOf(v, 0);
                        //       v.remove(0);
                        //       v.removeAll(v);
                        //       v.toString();
                        //       v.subList(0, 0);
                        //       v.spliterator();
                        //       v.setElementAt(v, 0);
        for (int k=0;k<v.size();k++) {
            Object op=v.get(k);
            
            if(op instanceof String)
            {
                String ops=String.valueOf(op);
                System.out.println(" This is from String object check");
                System.out.println(ops);
            }
            if(op instanceof Integer)
            {
                Integer intg= ((Integer) op).intValue();
                 System.out.println(" This is from Integer object check");
                System.out.println(intg);
            }
            
        }
       
     
                }
    
}
