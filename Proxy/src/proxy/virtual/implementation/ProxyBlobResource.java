/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.virtual.implementation;

import java.util.logging.Level;
import java.util.logging.Logger;
import proxy.virtual.model.BlobResource;

/**
 *
 * @author artur
 */
public class ProxyBlobResource implements BlobResource {

    private BlobResource realBlob = null;

    @Override
    public void touch() {
        if (realBlob == null) {
            System.out.print("Creating some big object ");
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                try {
                    Thread.currentThread().sleep(300);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProxyBlobResource.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            this.realBlob = new RealBlobResource();
            System.out.println("\nBig real blob is created");
        } else {
            System.out.println("Big real blob is just ready");
        }
        realBlob.touch();
    }
}
