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
public class Javaoops {

    int puppyAge;
    public  Javaoops(String name){
        System.out.println("the name is..."+ name);
    }
     public void setAge( int age ) {
      puppyAge = age;
         
   }
     public int getValue(){
         System.out.println("hiiiiii"+puppyAge);
        return puppyAge;
     }
    public static void main(String[] args) {
        
        Javaoops myPuppy = new Javaoops("monkey");
        
        myPuppy.setAge(5);
        myPuppy.getValue();
        System.out.println("javaoops.Javaoops.main()"+ myPuppy.puppyAge);
        
    }
    
}
