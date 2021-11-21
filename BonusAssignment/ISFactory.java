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
public class ISFactory extends AbstractFactory{

    @Override
   Staff getDoctor(String doctorType) {
        if(doctorType.equalsIgnoreCase("DoctorIS")){
        return new DoctorIS();
      }
        return null;
    }

    @Override
    Staff getTeachingAssistant(String teachingAssistantType) {
        if(teachingAssistantType.equalsIgnoreCase("TeachingAssistantIS"))
        return new TeachingAssistantIS();
        return null;
    }
}
