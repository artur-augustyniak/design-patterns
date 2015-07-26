/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.model;

/**
 *
 * @author artur
 */
public class LegacyTrain {

    public void ride(boolean forward, int velocity) {
        System.out.println("Legacy Train ride " + ((forward) ? "forward" : "backward") + " with speed: " + velocity);
    }

    public void justStop() {
        System.out.println("Legacy Train stop");
    }
}
