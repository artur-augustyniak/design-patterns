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
public class NarrowGaugeTrainFactory implements TrainFactory{

    @Override
    public Train createTrain() {
        System.out.println("Creating narrow gauge train");
        return new NarrowGaugeTrain();
    }
}
