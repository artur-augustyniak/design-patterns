/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullobject.implementation;

import nullobject.model.Train;

/**
 * Null Object as Singleton
 * @author artur
 */
public class NullTrain implements Train {

    private NullTrain() {
    }

    public static NullTrain getInstance() {
        return NullTrainHolder.INSTANCE;
    }

    private static class NullTrainHolder {

        private static final NullTrain INSTANCE = new NullTrain();
    }

    @Override
    public void ride() {
        ;//do nothing as null object should do
        System.out.println("Without this pattern nullPointerException should be here, BOOM!!!!");
    }
}
