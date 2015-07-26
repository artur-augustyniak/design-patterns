/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import singleton.model.DispatchConnection;

/**
 *
 * @author artur
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            DispatchConnection dc = DispatchConnection.getInstance();
            dc.sendMulticastMessage();
        }
    }
}
