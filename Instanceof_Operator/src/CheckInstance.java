/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CheckInstance {
    static  void show( aaa a)
    {
        if(a instanceof bbb)
        {
            System.out.println(" This instance is from bbb class");
        }
        else if(a instanceof ccc)
        {
            System.out.println(" This instance is of ccc");
            
            
        }
    }
    
    public static void main(String[] args) {
        show(new bbb());
        show(new ccc());
        
    }
}
class aaa{
    void show(){
    
    }
}
class  bbb extends aaa{

        
}
class ccc extends aaa{

}

