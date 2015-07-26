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
public class IlluminatedCarriage extends CarriageDecorator {

    public IlluminatedCarriage(BasicCarriage carriage) {
        super(carriage);
    }

    @Override
    public void ride() {
        System.out.println("Carriage is illuminated now.");
        this.carriage.ride();
    }
}
