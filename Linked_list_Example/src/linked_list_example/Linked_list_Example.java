/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list_example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Linked_list_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Books_class>lis=new LinkedList<Books_class>();
        Books_class bcsl=new Books_class();
            Scanner inc=new Scanner(System.in);
        System.out.println("Enter Publication year");
                     int publyr= inc.nextInt();
                        bcsl.setPublishyear(publyr);
        System.out.println("Enter Book Id");
                        int bkid=inc.nextInt();
                        bcsl.setBookID(bkid);
        System.out.println("Enter BookName");
                String BookName=inc.next();
                bcsl.setBookName(BookName);
        System.out.println();
        System.out.println("Enter ISBN Number");
                String ISBN=inc.next();
        System.out.println();
                 bcsl.setISBN(ISBN);  
        System.out.println("Enter Author name");
                String Author=inc.next();
        System.out.println();
                 bcsl.setAuthor(Author);
        System.out.println(bcsl.getAuthor());
        
  //  lis.add(bkid,BookName,ISBN,Author,publyr);
  
    }
    
}
