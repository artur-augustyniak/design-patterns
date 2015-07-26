/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import chainofresponsibility.implementation.DistortedRequest;
import chainofresponsibility.implementation.LocalRequest;
import chainofresponsibility.implementation.LocalRequestHandler;
import chainofresponsibility.implementation.RemoteRequest;
import chainofresponsibility.implementation.RemoteRequestHandler;
import chainofresponsibility.implementation.UnknownRequestHandler;
import chainofresponsibility.model.Request;
import chainofresponsibility.model.RequestHandler;
import java.util.Random;

/**
 * http://pl.wikipedia.org/wiki/%C5%81a%C5%84cuch_zobowi%C4%85za%C5%84_%28wzorzec_projektowy%29
 *
 * @author artur
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RequestHandler chain = new LocalRequestHandler();
        RequestHandler ndHandler = new RemoteRequestHandler();
        chain.setNextHandler(ndHandler);
        RequestHandler termHandler = new UnknownRequestHandler();
        ndHandler.setNextHandler(termHandler);

        Request[] requests = {new RemoteRequest(), new LocalRequest(), new DistortedRequest()};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            chain.handleRequest(requests[random.nextInt(requests.length)]);
        }
    }
}
