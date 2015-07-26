/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import prototype.implementation.MilitaryTrain;
import prototype.implementation.PassangerTrain;
import prototype.model.Train;

/**
 * http://pl.wikipedia.org/wiki/Prototyp_%28wzorzec_projektowy%29
 *
 * @author artur
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Train[] prototypes = {new MilitaryTrain(), new PassangerTrain()};
        for (Train prototype : prototypes) {
            for (int i = 0; i < 3; i++) {
                Train t = (Train) prototype.clone();
                t.setIdentifier(i);
                System.out.println(t.getName());
            }

        }
    }
}
