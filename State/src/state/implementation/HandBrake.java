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
public class HandBrake implements Brake {

    @Override
    public void brake() {
        System.out.println("Forcing to stop using Hand brake");
    }
}
