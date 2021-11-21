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
public class FactoryProducer {
    
    public static  AbstractFactory getFactory(String type)
    {
        if(type=="CS")
        {
           return new CSFactory();
        }
        else if(type=="IS")
        {
           return new ISFactory(); 
        }
        else if(type=="IT")
        {
            return new ITFactory();
        }
        return null;
    } 
}
