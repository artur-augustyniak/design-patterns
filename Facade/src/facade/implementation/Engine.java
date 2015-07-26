/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.implementation;

/**
 *
 * @author artur
 */
public class Engine {

    protected int throttle = 0;

    public void setThrottle(int throttle) {
        System.out.println("Engine throttle is set to: " + throttle);
        this.throttle = throttle;
    }

    public int getTorque() {
        int t = this.throttle * 1000;
        System.out.println("Engine torque is " + t);
        return this.throttle * 1000;

    }
}
