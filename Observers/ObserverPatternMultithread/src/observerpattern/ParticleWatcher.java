/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artur
 */
public class ParticleWatcher implements Observer, Runnable {

    /**
     *
     * @param o
     * @param o1
     */
    @Override
    public void update(Observable o, Object o1) {
        System.out.println(o1.toString() + Thread.currentThread());
        System.out.println(o);

    }

    @Override
    public void run() {
//        while (1 == 1) {
//            System.out.println("run");
//            try {
//                Thread.currentThread().sleep(1233);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ParticleWatcher.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
