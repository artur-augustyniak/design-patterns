/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import composite.implementation.Carriage;
import composite.implementation.Locomotive;
import composite.implementation.Train;

/**
 *
 * @author artur
 */
public class CompositeUsage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Train train = new Train();
        Locomotive firstLocomotive = new Locomotive();
        train.addVehicle(firstLocomotive);
        
        for (int i = 0; i < 10; i++) {
            train.addVehicle(new Carriage());
        }
        Locomotive secondLocomotive = new Locomotive();
        train.addVehicle(secondLocomotive);
        train.start();
        train.stop(56);

    }
}
