/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author saber farag
 */
public class Student extends Person {
 
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
     protected String status;

    public Student(String name) {
        super(name);
    }
     public Student(String name, String status) {
        super(name);
        this.status = status;
    }
     
   
}
