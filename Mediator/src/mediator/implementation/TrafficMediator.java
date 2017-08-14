/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.implementation;

import mediator.model.Mediator;

/**
 * @author artur
 */
public class TrafficMediator implements Mediator {

    CarParticipant carParticipant;
    TrainParticipant trainParticipant;

    public void setCarParticipant(CarParticipant carParticipant) {
        this.carParticipant = carParticipant;
    }

    public void setTrainParticipant(TrainParticipant trainParticipant) {
        this.trainParticipant = trainParticipant;
    }

    @Override
    public void requestCloseBarriers() {
        System.out.println("Mediator closing barrier and moving train!");
        trainParticipant.move();
    }

    @Override
    public void requestOpenBarriers() {
        System.out.println("Mediator opening barrier and moving car!");
        carParticipant.move();
    }
}
