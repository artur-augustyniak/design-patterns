/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy.virtual.implementation;

import proxy.virtual.model.BlobResource;

/**
 *
 * @author artur
 */
public class RealBlobResource implements BlobResource {
    
    @Override
    public void touch() {
        System.out.println("BigBlobResource" + this.toString() + " touched");
        
    }
}
