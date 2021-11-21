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
public class CSFactory extends AbstractFactory {

    @Override
    Staff getDoctor(String doctorType) {
        if(doctorType.equalsIgnoreCase("DoctorCS")){
        return new DoctorCS();
      }
        return null;
    }

    @Override
    Staff getTeachingAssistant(String teachingAssistantType) {
        if(teachingAssistantType.equalsIgnoreCase("TeachingAssistantCS"))
        return new TeachingAssistantCS();
        return null;
    }
    
}
