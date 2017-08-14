/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import mediator.implementation.CarParticipant;
import mediator.implementation.TrainParticipant;
import mediator.implementation.TrafficMediator;
import mediator.model.Participant;

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
        TrafficMediator dispatcher = new TrafficMediator();

        CarParticipant cp = new CarParticipant(dispatcher);
        TrainParticipant tp =  new TrainParticipant(dispatcher);

        dispatcher.setCarParticipant(cp);
        dispatcher.setTrainParticipant(tp);

        cp.execute();
        tp.execute();


    }
}
