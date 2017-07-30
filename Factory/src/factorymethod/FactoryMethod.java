/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.implementation.PesaFactory;
import factorymethod.model.Train;
import factorymethod.model.EnumReainFactory;
import factorymethod.model.PolimorphicFactoryMethod;

/**
 * http://en.wikipedia.org/wiki/Factory_method_pattern
 *
 * @author artur
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PolimorphicFactoryMethod tf = new PesaFactory();
        Train p = tf.createNewTrain();
        p.ride();

        for (EnumReainFactory.TrainType trainType : EnumReainFactory.TrainType.values()) {
            Train t = EnumReainFactory.createNewTrain(trainType);
            t.ride();
        }
    }
}
