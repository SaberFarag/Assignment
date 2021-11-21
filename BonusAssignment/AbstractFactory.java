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
public abstract class AbstractFactory {
    abstract Staff getDoctor(String doctorType);
    abstract Staff getTeachingAssistant(String teachingAssistantType);

}
