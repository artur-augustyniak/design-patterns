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
public class TrainParticipant implements Participant {

    private Mediator mediator;

    public TrainParticipant(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.requestCloseBarriers();
    }

    public void move() {
        System.out.println("Train passing!");
    }
}
