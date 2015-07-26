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
public class BreakingProcess extends AbstactProcess {

    @Override
    public void stepTwo() {
        System.out.println("Breaking process");
        System.out.println("enable brakes");
    }

    @Override
    public void stepThree() {
        System.out.println("when vechicle stopped enable hand brake");
    }
}
