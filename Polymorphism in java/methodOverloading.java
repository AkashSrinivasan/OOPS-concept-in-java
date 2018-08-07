/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoops;

/**
 *
 * @author JANUS
 */
public class methodOverloading {
    
    void test(){
            System.out.println("no parameters");
}
    void test(int a){
            System.out.println("the parameters is:"+ a );
}
    void test(int a,int b){
            System.out.println("second parameters are;;"+a+" "+b);
}
}
    class overloading{
        public static void main(String args[]) {
            methodOverloading m = new methodOverloading();
            m.test();
            m.test(10);
            m.test(10,20);
                    
        }
    }

