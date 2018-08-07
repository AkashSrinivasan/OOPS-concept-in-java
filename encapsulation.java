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
public class encapsulation {
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.setEmpid(111); 
        e1.setEmpName("akash");
        emp e2 = new emp();
        e2.setEmpid(122); 
        e2.setEmpName("vicky"); 
        System.out.println(e1.getEmpid()+" "+e1.getEmpName());
        System.out.println(e2.getEmpid()+" "+e2.getEmpName());
    }
}
class emp{
   private int empid;
   private String empName;

    public int getEmpid() {
        return empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
   
   
}
