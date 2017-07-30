/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.implementation;

import factorymethod.model.Train;

/**
 *
 * @author artur
 */
public class PassangerTrain implements Train{

    @Override
    public void ride() {
        System.out.println("Passanger train");
    }
    
}
