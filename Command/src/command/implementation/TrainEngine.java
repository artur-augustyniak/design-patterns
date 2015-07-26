/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command.implementation;

import command.model.Reciever;

/**
 *
 * @author artur
 */
public class TrainEngine implements Reciever {

    public void startEngine() {
        System.out.println("Train Engine started");
    }

    public void stopEngine() {
        System.out.println("Train Engine stopped");
    }
}
