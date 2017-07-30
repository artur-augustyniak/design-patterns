/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.model;

import factorymethod.implementation.CargoTrain;
import factorymethod.implementation.MilitaryTrain;
import factorymethod.implementation.PassangerTrain;

/**
 *
 * @author artur
 */
public class EnumReainFactory {

    public enum TrainType {

        PASSANGER,
        CARGO,
        MILITARY
    }

    public static Train createNewTrain(TrainType trainType) {
        switch (trainType) {
            case PASSANGER:
                return new PassangerTrain();
            case CARGO:
                return new CargoTrain();
            case MILITARY:
                return new MilitaryTrain();
        }
        throw new IllegalArgumentException("The train type " + trainType + " is not recognized.");


    }
}
