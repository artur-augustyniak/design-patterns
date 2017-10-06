/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.Observable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artur
 */
public class Particle extends Observable implements Runnable {

    private Integer x;
    private Random r;

    public Particle(Integer x) {
        this.x = x;
        r = new Random();

    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;

        setChanged();
        this.notifyObservers(x);
        clearChanged();
    }

    @Override
    public void run() {
        while(1==1){
        
        this.setX(r.nextInt());
            try {
                Thread.currentThread().sleep(1233);
            } catch (InterruptedException ex) {
                Logger.getLogger(Particle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
