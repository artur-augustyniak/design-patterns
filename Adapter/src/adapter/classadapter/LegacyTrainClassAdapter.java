/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.classadapter;

import adapter.model.LegacyTrain;
import adapter.model.Train;

/**
 *
 * @author artur
 */
public class LegacyTrainClassAdapter extends LegacyTrain implements Train {

    @Override
    public void forward(int velocity) {
        this.ride(true, velocity);
    }

    @Override
    public void stop(int breakePower) {
        this.justStop();
    }

    @Override
    public void backward(int velocity) {
        this.ride(false, velocity);
    }
}
