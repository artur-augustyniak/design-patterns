/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.implementation;

import chainofresponsibility.model.Request;

/**
 *
 * @author artur
 */
public class RemoteRequest implements Request{

    @Override
    public String getPayload() {
        return "http";
    }
    
}
