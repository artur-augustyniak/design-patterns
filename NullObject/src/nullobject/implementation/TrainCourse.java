/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullobject.implementation;

import nullobject.model.Train;

/**
 *
 * @author artur
 */
public class TrainCourse {

    private Train train;

    public TrainCourse(Train train) {
        if (train != null) {
            this.train = train;
        } else {
            this.train = NullTrain.getInstance();
        }
    }

    public void makeCourse() {
        this.train.ride();
    }
}
