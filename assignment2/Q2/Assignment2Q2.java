/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2q2;

/**
 *
 * @author saber farag
 */
public class Assignment2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject subject=new Subject(123,"StudentSubject",5);
        Address address=new Address(26,"Minya","Egypt");
        Student student=new Student("Saber","3.99",subject,address);
        student.show();
    }
    
}
