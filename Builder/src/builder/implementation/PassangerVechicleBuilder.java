/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.implementation;

import builder.model.RailwayVechicleBuilder;

/**
 *
 * @author artur
 */
public class PassangerVechicleBuilder extends RailwayVechicleBuilder{

    @Override
    public void buildVechicle() {
        vechicle.setSelfWeight(123);
        vechicle.setWheelsNum(8);
    }

    @Override
    public void setCodeName() {
        vechicle.setCodeName("Passanger Carriage");
    }
    
}
