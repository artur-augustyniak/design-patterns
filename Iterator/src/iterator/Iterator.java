/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import iterator.implementation.SomeObjectForcedToBeItrable;
import iterator.model.ExampleIterator;

/**
 *
 * @author artur
 */
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExampleIterator iterator = new SomeObjectForcedToBeItrable();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
