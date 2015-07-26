/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.implementation;

import abstractfactory.model.Train;

/**
 *
 * @author artur
 */
public class StandardGaugeTrain implements Train {

    @Override
    public void ride() {
        System.out.println("Standard gauge train is riding");
    }
}
