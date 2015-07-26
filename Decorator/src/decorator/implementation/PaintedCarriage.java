/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.implementation;

import decorator.model.BasicCarriage;
import decorator.model.CarriageDecorator;

/**
 *
 * @author artur
 */
public class PaintedCarriage extends CarriageDecorator {

    public PaintedCarriage(BasicCarriage carriage) {
        super(carriage);
    }

    @Override
    public void ride() {
        System.out.println("Carriage is painted now");
        this.carriage.ride();
    }
}
