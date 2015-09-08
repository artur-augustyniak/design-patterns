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
public class Locomotive implements RailwayVehicle {

    @Override
    public void stop(int brakePower) {
        System.out.println(this + " hamuję z mocą: " + brakePower);
    }

    @Override
    public void start() {
        System.out.println(this + " Jadę!!! i tylko ja napędzam pociąg");
    }

}
