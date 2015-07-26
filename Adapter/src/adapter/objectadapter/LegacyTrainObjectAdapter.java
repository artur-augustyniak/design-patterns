/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.objectadapter;

import adapter.model.Train;
import adapter.model.LegacyTrain;

/**
 *
 * @author artur
 */
public class LegacyTrainObjectAdapter implements Train {
    
    private LegacyTrain train = new LegacyTrain();
    
    @Override
    public void forward(int velocity) {
        this.train.ride(true, velocity);
    }
    
    @Override
    public void stop(int breakePower) {
        this.train.justStop();
    }
    
    @Override
    public void backward(int velocity) {
        this.train.ride(false, velocity);
    }
}
