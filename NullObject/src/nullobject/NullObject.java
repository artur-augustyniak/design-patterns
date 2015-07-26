/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullobject;

import java.util.Random;
import nullobject.implementation.ConcreteTrain;
import nullobject.implementation.TrainCourse;
import nullobject.model.Train;

/**
 * http://pl.wikipedia.org/wiki/Pusty_Obiekt_%28wzorzec_projektowy%29
 *
 * @author artur
 */
public class NullObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Train nonExisting = null;
        //lets, say for unknown reasons some objects can be null refernces
        Train[] trains = {new ConcreteTrain(), nonExisting, new ConcreteTrain()};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            TrainCourse course = new TrainCourse(trains[r.nextInt(trains.length)]);
            course.makeCourse();
        }


    }
}
