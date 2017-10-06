package observerpattern;

import java.util.Observable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author artur
 */
public class Particle extends Observable implements Runnable {

    private Integer x;
    private Random r;

    public Particle(Integer x) {
        this.x = x;
        r = new Random();

    }


    public void setX(Integer x) {
        this.x = x;

        setChanged();
        this.notifyObservers(x);
        clearChanged();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            this.setX(r.nextInt());
            try {
                Thread.currentThread().sleep(Math.abs(r.nextInt() % 12000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Particle.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
}
