/*
 * 
 * and open the template in the editor.
 */
package java_stringbuffer;

/**
 *
 * @author PycoderCP
 */
public class Java_StringBuffer {
     /* Every method in java string buffer is  synchronizer.
    Thus only one thread is allowed to operate on a string object. 
    anotheer thread must wait untill first completes its operetaion.
     Thus where performance is required it is not recomended but when thread safety  is required it is recomended.
    
    
    
    
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name="Calc";
        StringBuffer sbf= new StringBuffer(name);
        sbf.append("Ali");
        System.out.println(sbf);
        sbf.reverse();
        String sd=sbf.toString();
       System.out.println(sbf);
        String srd=" It";
        StringBuffer der=new StringBuffer(srd);
        long start=System.currentTimeMillis();
        Runtime r=Runtime.getRuntime();
        long startmem=r.freeMemory();
        for(int i=0;i<180;++i)
        {
            srd+="is";
        }
         long end=System.currentTimeMillis();
         long endmem=r.freeMemory();
         System.out.println(" Time taken is "+(end-start));
         System.out.println("Memory consumed "+(startmem-endmem));
//long startmemry=
        
        // TODO code application logic here
    }
    
}
