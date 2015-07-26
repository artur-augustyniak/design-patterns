/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import mediator.implementation.CarVechicle;
import mediator.implementation.TrainVechicle;
import mediator.implementation.VechicleMediator;

/**
 *
 * http://en.wikipedia.org/wiki/Mediator_pattern
 *
 * @author artur
 */
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VechicleMediator dispatcher = new VechicleMediator();
        dispatcher.setCar(new CarVechicle(dispatcher));
        dispatcher.setTrain(new TrainVechicle(dispatcher));
        dispatcher.rideOnRailway();
        dispatcher.rideOnStreet();
    }
}
