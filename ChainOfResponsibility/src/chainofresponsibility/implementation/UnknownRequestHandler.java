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
public class UnknownRequestHandler extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("Distorted request handler processing: " + request.getPayload() + " end of chain;");
    }
}
