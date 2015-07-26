/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.implementation;

import prototype.model.Train;

/**
 *
 * @author artur
 */
public class PassangerTrain extends Train {

    @Override
    public String getName() {
        return "I'm Passanger train, object id: " + this.toString() + " given id: " + this.identifier;
    }
}
