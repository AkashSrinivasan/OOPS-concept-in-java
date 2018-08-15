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
public class thisKeyword {  
    int rollno;  
    String name;  
    float fee;  
thisKeyword(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
}  
void display(){
    System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
    public static void main(String args[]){  
        thisKeyword s1=new thisKeyword(111,"ankit",5000f);  
        thisKeyword s2=new thisKeyword(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
}
}  

