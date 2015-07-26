/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.implementation;

/**
 *
 * @author artur
 */
public class RideController {

    protected boolean ride = false;

    public boolean isRide() {
        return ride;
    }

    public void setRide(boolean ride) {
        System.out.println("Controller is set to: " + ride);
        this.ride = ride;
    }
}
