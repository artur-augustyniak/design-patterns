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
public class PlatformVechicleBuilder extends RailwayVechicleBuilder {

    @Override
    public void buildVechicle() {
        vechicle.setSelfWeight(80);
        vechicle.setWheelsNum(16);
    }

    @Override
    public void setCodeName() {
        vechicle.setCodeName("Platform Carriage");
    }
}
