/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.implementation;

import composite.model.LiveVech;
import composite.model.RailwayVehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public class Train implements LiveVech {

    private List<RailwayVehicle> carriages;

    public Train() {
        this.carriages = new ArrayList<RailwayVehicle>();
    }

    public List<RailwayVehicle> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<RailwayVehicle> carriages) {
        this.carriages = carriages;
    }

    @Override
    public void brake(int brakePower) {
        for (RailwayVehicle railwayVehicle : carriages) {
            railwayVehicle.brake(brakePower);
        }
    }

    @Override
    public void ride() {
        for (RailwayVehicle r : carriages) {
            if(r instanceof LiveVech){     
               LiveVech l = (LiveVech) r;
               l.ride();
            }
        }
    }
}
