/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import command.implementation.Driver;
import command.implementation.StartEngineCommand;
import command.implementation.StopEngineCommand;
import command.implementation.TrainEngine;
import command.model.Command;
import command.model.Invoker;
import command.model.Reciever;

/**
 *
 * @author artur
 */
public class CommandExample {

    /**
     * http://pl.wikipedia.org/wiki/Polecenie_%28wzorzec_projektowy%29
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrainEngine engine = new TrainEngine();
        
        Command start = new StartEngineCommand(engine);
        Command stop = new StopEngineCommand(engine);
        
        Invoker driver = new Driver();
        driver.pushAndExecute(start);
        driver.pushAndExecute(stop);
    }
}
