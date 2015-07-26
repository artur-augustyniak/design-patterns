/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.implementation.PassangerVechicleBuilder;
import builder.implementation.PlatformVechicleBuilder;
import builder.model.RailwayVechicle;
import builder.model.RailwayVechicleBuilder;
import builder.model.VechicleBuilderController;
import java.util.Random;

/**
 * http://pl.wikisource.org/wiki/Budowniczy_%28wzorzec_projektowy%29/kod
 * @author artur
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VechicleBuilderController controller = new VechicleBuilderController();
        RailwayVechicleBuilder[] builders = {new PassangerVechicleBuilder(), new PlatformVechicleBuilder()};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            controller.setBuilder(builders[r.nextInt(builders.length)]);
            controller.createVechicle();
            RailwayVechicle v = controller.getVechicle();
            v.ride();
        }


    }
}
