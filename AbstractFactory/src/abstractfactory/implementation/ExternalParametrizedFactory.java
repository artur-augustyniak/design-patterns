/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.implementation;

import abstractfactory.RandomizedEnviroment;
import abstractfactory.model.Train;
import abstractfactory.model.TrainFactory;

/**
 *
 * @author artur
 */
public class ExternalParametrizedFactory implements TrainFactory {

    private TrainFactory getFactoryByEnv() {
        Integer gauge = RandomizedEnviroment.getRailwayGauge();
        if (gauge > 1435) {
            return new BroadGaugeTrainFactory();
        } else if (gauge < 1435) {
            return new NarrowGaugeTrainFactory();
        } else {
            return new StandardGaugeTrainFactory();
        }
    }

    @Override
    public Train createTrain() {
        return this.getFactoryByEnv().createTrain();
    }

}
