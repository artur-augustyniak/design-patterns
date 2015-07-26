/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command.implementation;

import command.model.Command;

/**
 *
 * @author artur
 */
public class StopEngineCommand implements Command {

    private TrainEngine engine;

    public StopEngineCommand(TrainEngine reciever) {
        this.engine = reciever;
    }

    @Override
    public void execute() {
        this.engine.stopEngine();
    }
}
