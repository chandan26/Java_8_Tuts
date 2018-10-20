/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetime_java;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Pycoder
 */
public class DateTime_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Date d=new Date();
        System.out.println(d);
        SimpleDateFormat smdp=new SimpleDateFormat("yyyy-mmmm-dd");
        //Why Cant I use the (YYYY-MMMM-DD) that results in something odd result
        
        String dt=smdp.format(d);
        System.out.println(dt);
    }
    
}
