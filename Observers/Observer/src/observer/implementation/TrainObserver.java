/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.implementation;

import observer.model.ExampleObservable;
import observer.model.ExampleObserver;

/**
 *
 * @author artur
 */
public class TrainObserver implements ExampleObserver {

    @Override
    public void update(ExampleObservable observed) {
        System.out.println("OBJECT CAHNGED STATE!!!!");
        System.out.println(observed.toString() + " object changed it's state: " + observed.getState());
    }
}
