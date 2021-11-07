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
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mammal s1=new Mammal();
        s1.eat();
        s1.travel();
        System.out.println(" Number of Leges Animals : " + s1.NoOfLegs());
        System.out.println(" Foods Favorite for Animals "+s1.FavFood());
     
    }
    
}
