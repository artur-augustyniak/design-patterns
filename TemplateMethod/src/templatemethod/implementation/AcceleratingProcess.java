/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod.implementation;

import templatemethod.model.AbstactProcess;

/**
 *
 * @author artur
 */
public class AcceleratingProcess extends AbstactProcess {

    @Override
    public void stepTwo() {
        System.out.println("Accelerating process");
        System.out.println("Disable hand brake");
    }

    @Override
    public void stepThree() {
        System.out.println("pull throttle");
    }
}
