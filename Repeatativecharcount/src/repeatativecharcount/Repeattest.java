/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatativecharcount;

/**
 *
 * @author Administrator
 */
public class Repeattest {
      public static String repeatst(String strs) 
      {
          char[] strts=strs.toCharArray();
          StringBuffer compresdst= new StringBuffer();
          char lastchar=strts[0];
          //Assigning the starting charecter of the array as the initial carecter to start with 
          int count=1;
          // Assignig the 
          
          for(int i=1;i<strts.length;i++)// here we have started the loop with 1 index as starting from 0 will lead to leave a chercter from the string
          {
              if(strts[i]==lastchar)
              {
                  // the above if loop tries find a match comparing with other charecters in the array.
                  count+=1;
                  // 
              //Increasing the count for a specific charecter.
              }
              else
              {
                  compresdst.append((lastchar+"")+count);
                   count=1;
                   // when there is no further matches found for the charecter reset the counter with the value 1.
                   lastchar= strts[i];
                   // setting the last charecter as last char after incresing the value of i.
                   
              }
                //System.out.println(strts[i]);
           
          }
          compresdst.append((lastchar+"")+count);
          //finally creating the array with the count and the number of strings. 
           System.out.println(compresdst.toString());
          return compresdst.toString();
         
        //String comprsd= (compresdst+lastchar+count).t        
    }
    
}
