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
public class Faculty extends Employee{
    protected String officeHour;
   protected  String rank;
    private String officeHours;

    public Faculty(String name) {
        super(name);
    } 
    public String getOfficeHours() {
       
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
      
  
    
    
}
