/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.classadapter.LegacyTrainClassAdapter;
import adapter.model.CurrentTrain;
import adapter.objectadapter.LegacyTrainObjectAdapter;
import adapter.model.Train;

/**
 * http://pl.wikisource.org/wiki/Adapter_%28wzorzec_projektowy%29/kod
 *
 * @author artur
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int velocity = 12;
        int brakePower = 100;
        //Object and Class adapter demo
        Train[] trains = {new LegacyTrainObjectAdapter(), new CurrentTrain(), new LegacyTrainClassAdapter()};
        
        for (Train t : trains) {
            t.forward(velocity);
            t.stop(brakePower);
            t.backward(velocity);
        }
    }
}
