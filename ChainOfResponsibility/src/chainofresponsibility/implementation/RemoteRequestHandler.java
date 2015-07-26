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
public class RemoteRequestHandler extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if (request instanceof RemoteRequest) {
            System.out.println("Remote request handler processing: " + request.getPayload());
        } else {
            nextHandler.handleRequest(request);
        }
    }
}
