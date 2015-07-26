/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge.model;

/**
 *
 * @author artur
 */
public abstract class Train {

    protected Engine engine;

    public Train(Engine engine) {
        this.engine = engine;
    }

    public abstract void ride();

    public abstract void stop();
}
