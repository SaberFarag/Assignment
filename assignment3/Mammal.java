/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author saber farag
 */
public class Mammal implements Animal {

    
    public void eat() {
     System.out.println("Animal eats the plants ");
    }

   
    public void travel() {
             System.out.println("Animal travel to far away places ");

    }
    public int NoOfLegs()
    {
        return 5;
    }
    public String FavFood()
    {
        return " leaves , stems , roots , nuts ";
    }
    
}
