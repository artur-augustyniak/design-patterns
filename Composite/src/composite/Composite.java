/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import composite.implementation.Carriage;
import composite.implementation.Locomotive;
import composite.implementation.Train;

/**
 *
 * @author artur
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Train t = new Train();
        Locomotive l = new Locomotive();
        t.getCarriages().add(l);
        
        for (int i = 0; i < 10; i++) {
            t.getCarriages().add(new Carriage());
        }
        Locomotive l2 = new Locomotive();
        t.getCarriages().add(l2);
        t.ride();
        t.brake(56);

    }
}
