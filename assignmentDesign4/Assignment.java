/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;

/**
 *
 * @author saber farag
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        MemberFactory employee=new MemberFactory();
          
        System.out.println("Enter Employee you want to know Salary and years of work : ");
        String nameEmployee=input.nextLine();
        Staff s=employee.getEmployee(nameEmployee);
        if(nameEmployee==null){
            System.out.println("Pease Enter Employee");
           
        }
        else{
        System.out.println("the name of Employee "+nameEmployee);
        System.out.print("the Salary of Employee ");
        s.GetSalary();
        System.out.println();
        System.out.print("the number of Years of Works  ");
        s.getYearsOfWork();
        System.out.println();
        
        
        }
        
    }
    
}
