/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.model;

/**
 * @author artur
 */
public abstract class CarriageDecorator implements BasicCarriage {

    protected BasicCarriage carriage;

    public CarriageDecorator(BasicCarriage carriage) {
        this.carriage = carriage;
    }

    public BasicCarriage getDecoratedCarriage() {
        return carriage;
    }
}
