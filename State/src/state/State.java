/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Random;
import state.implementation.BrakeSystem;
import state.implementation.EmergencyBrake;
import state.implementation.HandBrake;
import state.model.Brake;

/**
 * http://en.wikipedia.org/wiki/State_pattern
 *
 * @author artur
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BrakeSystem brake = new BrakeSystem();
        brake.brake();

        Brake[] brakes = {new HandBrake(), new EmergencyBrake()};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            brake.setCurrentBrake(brakes[r.nextInt(brakes.length)]);
            brake.brake();
        }


    }
}
