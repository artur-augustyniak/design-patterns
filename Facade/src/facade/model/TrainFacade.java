/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.model;

import facade.implementation.DrivenAxels;
import facade.implementation.Engine;
import facade.implementation.RideController;

/**
 *
 * @author artur
 */
public class TrainFacade {

    protected DrivenAxels axles;
    protected Engine engine;
    protected RideController controller;

    public TrainFacade() {
        this.axles = new DrivenAxels();
        this.engine = new Engine();
        this.controller = new RideController();
    }

    public void ride(int throttle) {
        this.controller.setRide(true);
        this.engine.setThrottle(throttle);
        this.axles.setRotations(this.engine.getTorque());
        System.out.println("Train is moving");

    }

    public void stop() {
        this.controller.setRide(false);
        this.engine.setThrottle(0);
        this.axles.setRotations(this.engine.getTorque());
        System.out.println("Train stopped");
    }
}
