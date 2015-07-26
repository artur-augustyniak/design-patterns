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
public class BroadGaugeTrain implements Train{

    @Override
    public void ride() {
        System.out.println("Broad gauge train is riding");
    }
    
}
