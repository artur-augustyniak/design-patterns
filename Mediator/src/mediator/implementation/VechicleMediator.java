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
public class VechicleMediator implements Mediator {

    CarVechicle car;
    TrainVechicle train;

    public void setCar(CarVechicle car) {
        this.car = car;
    }

    public void setTrain(TrainVechicle train) {
        this.train = train;
    }

    @Override
    public void rideOnRailway() {
        train.rideOnRailway();
    }

    @Override
    public void rideOnStreet() {
        car.rideOnRoad();
    }
}
