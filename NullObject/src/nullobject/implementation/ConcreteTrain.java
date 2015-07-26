/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nullobject.implementation;

import nullobject.model.Train;

/**
 *
 * @author artur
 */
public class ConcreteTrain implements Train{

    @Override
    public void ride() {
        System.out.println("Real train can ride in real word");
    }
    
}
