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
public class DieselEngine implements Engine {

    @Override
    public void setRpm(int rpm) {
        if (rpm > 0) {
            System.out.println("Diesel engine rpm: " + rpm);
        } else {
            System.out.println("Diesel engine rpm: idle");
        }
    }
}
