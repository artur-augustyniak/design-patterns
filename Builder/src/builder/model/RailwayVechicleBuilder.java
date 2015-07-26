/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.model;

/**
 *
 * @author artur
 */
public abstract class RailwayVechicleBuilder {

    protected RailwayVechicle vechicle;

    public void createNewRailwayVechicle() {
        vechicle = new RailwayVechicle();
    }

    public RailwayVechicle getVechicle() {
        return vechicle;
    }

    public abstract void buildVechicle();

    public abstract void setCodeName();
}
