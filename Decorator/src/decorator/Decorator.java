/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import decorator.implementation.EmptyCarriage;
import decorator.implementation.IlluminatedCarriage;
import decorator.implementation.PaintedCarriage;
import decorator.model.BasicCarriage;

/**
 * http://pl.wikisource.org/wiki/Dekorator_%28wzorzec_projektowy%29/kod
 * @author artur
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicCarriage c = new PaintedCarriage(new IlluminatedCarriage(new EmptyCarriage()));
        c.ride();
    }
}
