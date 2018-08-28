/*
 * 
 */
package encapulation_getter_setter;

/**
 *
 * @author Administrator
 */
public class Encapulation_getter_setter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

person p=new person();
p.setHeight(6);
p.setWeight(66);
        System.out.println("The weight of the person is "+ p.getWeight());



// TODO code application logic 
        
    }
    
}
class person
{
    
   ////**************** in order to generate the getter and setter method for the private data elements in any class use the following******///// 
////------>>> Right click  inside the class-->  Find the option  "Insert code"----> in the context menu click on the  "Getter and setter"*******///////    
    private int height;
    private int weight;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}