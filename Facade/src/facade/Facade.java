/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import facade.model.TrainFacade;

/**
 * http://en.wikipedia.org/wiki/Facade_pattern
 *
 * @author artur
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrainFacade train = new TrainFacade();
        train.ride(10);
        train.stop();
    }
}
