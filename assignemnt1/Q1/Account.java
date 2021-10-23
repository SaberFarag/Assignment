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
public class Account {
    private int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    
  private java.util.Date dateCreated;
     public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int id,double balance )
    {
      this.id=id;
      this.balance=balance;
      this.annualInterestRate=annualInterestRate; 
    }

    Account(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId(int id)
    {
        return id;
    }
     public void setBalance(double balance)
    {
        this.balance=balance;
    }
      public double getBalance()
    {
        return balance;
    }
      public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
         public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
      public String getDateCreated() {
        return this.dateCreated.toString();
    }
       public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
        public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
     public void deposit(double amount) {
        this.balance += amount;
    }
}
