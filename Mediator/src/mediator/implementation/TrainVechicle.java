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
public class TrainVechicle implements Command {

    private Mediator mediator;

    public TrainVechicle(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.rideOnRailway();
    }

    public void rideOnRailway(){
        System.out.println("Train arrives");
    }
}
