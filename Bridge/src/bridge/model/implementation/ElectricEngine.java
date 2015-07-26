/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.model.implementation;

import bridge.model.Engine;

/**
 *
 * @author artur
 */
public class ElectricEngine implements Engine {

    @Override
    public void setRpm(int rpm) {
        System.out.println("Electric engine rpm: " + rpm);
    }
}
