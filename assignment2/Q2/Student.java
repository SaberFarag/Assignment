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
public class Student {
    String nameStudent;
    private int idStudent;
    String  gpa;
    Subject subject;
    Address address;
    Student(String nameStudent,String gpa,Subject subject,Address address)
    {
        this.nameStudent=nameStudent;
        this.gpa=gpa;
        this.subject=subject;
        this.address=address;
    }
    public void setIdStudet(int idStudent)
    {
        this.idStudent=idStudent;
    }
    public int getIdStudent()
    {
        return idStudent;
    }
    void show()
    {
        System.out.println("nameStudent : "+nameStudent+" Gpa : "+gpa+" nameSubject : "+subject.nameSubject+" hours : "+subject.hours
        +" StreetNumber : "+address.streetNo+" City :"+address.city+" Country : "+address.country);
    }
}
