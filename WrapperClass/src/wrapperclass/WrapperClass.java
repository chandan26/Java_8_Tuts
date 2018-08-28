/*
 *  The Wrapper Clas tutorial 
 */
package wrapperclass;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WrapperClass {

    /**
     * 
     */
    public static void main(String[] args) {
        // There are classes that are helpful to use the mechanism to convert primitive into object and object into primitive.
    
        System.out.println("Enter a  integer value that will be pared as string");
        Scanner scd=new Scanner(System.in);
        String val=scd.next();
        int value=Integer.valueOf(val);
        System.out.println("Enter another  integer value that will be pared as string");
        String val2=scd.next();
        int value2=Integer.valueOf(val2);
        System.out.println("Result of the additon of the two values parsed as string and converted using Wrapper class "+ (value+value2));
    
    }
    
}
/*


Enter a  integer value that will be pared as string
478
Enter another  integer value that will be pared as string
22
Result of the additon of the two values parsed as string and converted using Wrapper class 500
*/