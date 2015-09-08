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
    public void stop(int brakePower) {
        System.out.println(this + " hamuję z mocą: " + (brakePower-10) + " ,mniej niż lokomotywa bo jestem tylko wagonikiem");
    }

    @Override
    public void start() {
        System.out.println(this + "przy ruszaniu nic nie robię sam z siebie bo jestem tylko wagonikiem");
    }
    
}
