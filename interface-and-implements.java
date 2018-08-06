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
interface interfaceImplement {
    
    void print();
}
class A1 implements interfaceImplement{
    public void print(){
        System.out.println("hello");
    }
    
    public static void main(String[] args) {
        A1 j = new A1();
        j.print();
    }
}
