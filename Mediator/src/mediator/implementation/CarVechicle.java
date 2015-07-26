/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.implementation;

import mediator.model.Command;
import mediator.model.Mediator;

/**
 *
 * @author artur
 */
public class CarVechicle implements Command {

    private Mediator mediator;

    public CarVechicle(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.rideOnStreet();
    }

    public void rideOnRoad() {
        System.out.println("Car arrives");
    }
}
