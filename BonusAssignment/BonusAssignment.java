/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusassignment;

/**
 *
 * @author saber farag
 */
public class BonusAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory factory=FactoryProducer.getFactory("CS");
        Staff type1=factory.getDoctor("CSDoctor");
        type1.GetSalary();
        type1.getYearsOfWork();
        Staff type2=factory.getTeachingAssistant("TeachingAssistantCS"); 
        type2.GetSalary();
        type2.getYearsOfWork();

    }
    
}
