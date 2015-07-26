/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.implementation;

import decorator.model.BasicCarriage;

/**
 *
 * @author artur
 */
public class EmptyCarriage implements BasicCarriage {

    @Override
    public void ride() {
        System.out.println("Carriage goes");
    }
}
