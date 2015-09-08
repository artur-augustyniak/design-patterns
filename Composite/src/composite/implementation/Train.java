/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.implementation;

import composite.model.RailwayVehicle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public class Train implements RailwayVehicle {

    private final List<RailwayVehicle> carriages;

    public Train() {
        this.carriages = new ArrayList<RailwayVehicle>();
    }

    public void addVehicle(RailwayVehicle v) {
        carriages.add(v);
    }

    @Override
    public void stop(int brakePower) {
        for (RailwayVehicle railwayVehicle : carriages) {
            railwayVehicle.stop(brakePower);
        }
    }

    @Override
    public void start() {
        for (RailwayVehicle r : carriages) {
                r.start();
        }
    }
}
