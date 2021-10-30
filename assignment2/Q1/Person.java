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
public class Person {
   protected  String name;
   protected  String address;
   protected  String phoneNumber;
   protected  String emailAddress;
   
   public Person(String name) {
        this.name = name;
    }
    
   public void setName(String name)
   {
   this.name=name;
   }
   public String getName()
   {
       return name;
   }
   public void setAddress(String address)
   {
       this.address=address;
   }
   public String getAdress()
   {
       return address;
   }
   public void setPhoneNumber(String phoneNumber)
   {
     this.phoneNumber=phoneNumber;       
   }
   public String getPhoneNumber()
   {
       return phoneNumber;
   }
   public void setEmailAddress(String emailAddress)
   {
     this.emailAddress=emailAddress;       
   }
    public String getEmailAddress()
   {
       return emailAddress;
   }
}
