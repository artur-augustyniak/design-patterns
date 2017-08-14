/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.implementation;

import mediator.model.Participant;
import mediator.model.Mediator;

/**
 * @author artur
 */
public class CarParticipant implements Participant {

    private Mediator mediator;

    public CarParticipant(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.requestOpenBarriers();
    }

    public void move() {
        System.out.println("Car arrives");
    }
}
