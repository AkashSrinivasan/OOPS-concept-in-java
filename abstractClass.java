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
abstract class AbstractClass {
    abstract int bnk();
}
class sbi extends AbstractClass{
   int bnk(){
       return 8;
   }
}
class ib extends AbstractClass{
    int bnk(){
    return 9;
}
}
class testBank{
    public static void main(String[] args) {
        AbstractClass b,c;
        b = new sbi();
        System.out.println("sbi bank result=="+b.bnk());
        c = new ib();
        System.out.println("ib bank result=="+c.bnk());
        
    }
}
