/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.implementation;

import factorymethod.model.PolimorphicFactoryMethod;
import factorymethod.model.Train;

/**
 *
 * @author artur
 */
public class PesaFactory implements PolimorphicFactoryMethod {

    @Override
    public Train createNewTrain() {
        return new PassangerTrain();
    }
}
