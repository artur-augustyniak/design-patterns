/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author artur
 */
public class ParticleWatcher implements Observer {

    /**
     * @param o
     * @param o1
     */
    @Override
    public void update(Observable o, Object o1) {
        System.out.println("###############################################");
        System.out.println(o1.toString() + " " + Thread.currentThread());
        System.out.println(o);
        System.out.println("--");

    }

}
