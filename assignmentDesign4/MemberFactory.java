/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author saber farag
 */
public class MemberFactory {
    
    public Staff getEmployee(String employee)
    {
          
        if(employee.equalsIgnoreCase("TeachingAssistant"))
        {
            return new TeachingAssistant();
         }
        else if (employee.equalsIgnoreCase("Doctor"));
        {
          return new Doctor();
        }
       
    }
    
}
