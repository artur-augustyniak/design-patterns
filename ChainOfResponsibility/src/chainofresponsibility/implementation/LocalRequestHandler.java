/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.implementation;

import chainofresponsibility.model.Request;
import chainofresponsibility.model.RequestHandler;

/**
 *
 * @author artur
 */
public class LocalRequestHandler extends RequestHandler{

    @Override
    public void handleRequest(Request request) {
        if (request instanceof LocalRequest) {
            System.out.println("Local request handler processing: " + request.getPayload());
        }else{
            nextHandler.handleRequest(request);
        }
    }
    
}
