/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.model;

/**
 *
 * @author artur
 */
public class CurrentTrain implements Train {

    @Override
    public void forward(int velocity) {
        System.out.println("Current Train ride forward with speed: " + velocity);
    }

    @Override
    public void stop(int breakePower) {
        System.out.println("Current Train stop with brake power: " + breakePower);
    }

    @Override
    public void backward(int velocity) {
        System.out.println("Current Train ride backward with speed: " + velocity);
    }
}
