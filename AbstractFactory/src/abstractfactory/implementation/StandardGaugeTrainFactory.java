/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.implementation;

import abstractfactory.model.Train;
import abstractfactory.model.TrainFactory;

/**
 *
 * @author artur
 */
public class StandardGaugeTrainFactory implements TrainFactory {

    @Override
    public Train createTrain() {
        System.out.println("Creating standard gauge train");
        return new StandardGaugeTrain();
    }
}
