package observerpattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author artur
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Particle p = new Particle(2);
        ParticleWatcher pw = new ParticleWatcher();


        p.addObserver(pw);
        Thread t = new Thread(p);

        t.start();
        p.setX(4);
        try {
            Thread.currentThread().sleep(123);
        } catch (InterruptedException ex) {
            Logger.getLogger(ObserverPattern.class.getName()).log(Level.SEVERE, null, ex);
        }
        p.setX(734535);
        p.notifyObservers();

        System.out.println("main");

    }
}
