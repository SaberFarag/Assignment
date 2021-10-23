/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmnet1;

/**
 *
 * @author saber farag
 */
public class Assignmnet1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Account account = new Account(1122, 20000.0);
          account.setAnnualInterestRate(4.5);
          account.withdraw(2500.0);
          account.deposit(3000.0);
         System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
    
}
