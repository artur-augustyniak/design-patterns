/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.model;

/**
 *
 * @author artur
 */
public class VechicleBuilderController {

    private RailwayVechicleBuilder builder;

    public void setBuilder(RailwayVechicleBuilder builder) {
        this.builder = builder;
    }

    public void createVechicle() {
        builder.createNewRailwayVechicle();
        builder.buildVechicle();
        builder.setCodeName();

    }

    public RailwayVechicle getVechicle() {
        return builder.getVechicle();
    }
}
