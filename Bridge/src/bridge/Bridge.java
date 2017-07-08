/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import bridge.model.Train;
import bridge.model.implementation.DieselEngine;
import bridge.model.implementation.ElectricEngine;
import bridge.model.implementation.HybridCar;
import bridge.model.implementation.HybridTrain;

/**
 * http://en.wikipedia.org/wiki/Bridge_pattern
 *
 * @author artur
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Train[] trains = {
                new HybridTrain(new ElectricEngine()),
                new HybridTrain(new DieselEngine()),
                new HybridCar(new ElectricEngine()),
        };
        for (Train train : trains) {
            train.ride();
            train.stop();
        }
    }
}
