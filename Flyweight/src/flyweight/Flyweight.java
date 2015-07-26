/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.implementation.RealCariageFlyweightClient;
import flyweight.model.CarriageFactory;
import java.util.Random;

/**
 * http://en.wikipedia.org/wiki/Flyweight_pattern
 *
 * @author artur
 */
public class Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();

        String[] carigeTypes = {"box", "platform", "passenger"};
        RealCariageFlyweightClient[] cariages = new RealCariageFlyweightClient[100];

        for (int i = 0; i < 100; i++) {
            int idx = r.nextInt(carigeTypes.length);
            cariages[i] = new RealCariageFlyweightClient(r.nextInt(200), carigeTypes[idx]);
            cariages[i].reportState();
        }
        System.out.println("Statistics");
        System.out.println("Client objects count: " + cariages.length);
        System.out.println("Flyweight objects count: " + CarriageFactory.flCount());



    }
}
