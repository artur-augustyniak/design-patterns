/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state.implementation;

import state.model.Brake;

/**
 *
 * @author artur
 */
public class BrakeSystem implements Brake {

    private Brake currentBrake;

    public BrakeSystem() {
        this.currentBrake = new EngineBrake();
    }

    public void setCurrentBrake(Brake currentBrake) {
        this.currentBrake = currentBrake;
    }

    @Override
    public void brake() {
        this.currentBrake.brake();
    }
}
