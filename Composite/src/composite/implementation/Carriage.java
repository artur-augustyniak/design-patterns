/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.implementation;

import composite.model.RailwayVehicle;

/**
 *
 * @author artur
 */
public class Carriage implements RailwayVehicle{

    @Override
    public void brake(int brakePower) {
        System.out.println(this + " braking with power: " + brakePower);
    }
    
}
