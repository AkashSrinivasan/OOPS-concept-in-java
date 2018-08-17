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
public class methodOverriding {
    void animals(){
        System.out.println("the animals are dangerous");
    }
}
class dogs extends methodOverriding{
    void animals(){
        System.out.println("dogs are cute");
    }
    public static void main(String[] args) {
        dogs m = new dogs();
        m.animals();
    }
}
 
