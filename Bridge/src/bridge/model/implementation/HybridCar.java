/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.model.implementation;

import bridge.model.Engine;
import bridge.model.Train;

/**
 *
 * @author artur
 */
public class HybridCar extends Train {

    public HybridCar(Engine engine) {
        super(engine);
    }

    @Override
    public void ride() {
        this.engine.setRpm(10);
        System.out.println("Hybrid car is moving.");
    }

    @Override
    public void stop() {
        this.engine.setRpm(0);
        System.out.println("Hybrid car is not moving.");
    }
}
