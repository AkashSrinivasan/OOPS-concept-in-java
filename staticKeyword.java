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
public class staticKey {
    int rollnum;
    String name;
    static String collage = "panimalar";
    
    staticKey(int r,String n){
        rollnum = r;
        name = n;
    }
    
    void display(){
        System.out.println("rollnumber is:"+rollnum+" name;"+name+" " +collage);
    }
    public static void main (String[] args){
        staticKey s1 = new staticKey(111, "akash");
        staticKey s2 = new staticKey(222, "vicky");
        s1.display();
        s2.display();
    }
}
