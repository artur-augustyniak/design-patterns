/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.implementation;

import composite.model.LiveVech;
import composite.model.RailwayVehicle;

/**
 *
 * @author artur
 */
public class Locomotive implements LiveVech{

    @Override
    public void brake(int brakePower) {
        System.out.println(this + " braking with power: " + brakePower);
    }

    @Override
    public void ride() {
        System.out.println("Jadę!!!");
    }
    
}
