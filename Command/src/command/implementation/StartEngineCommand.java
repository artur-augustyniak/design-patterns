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
public class StartEngineCommand implements Command {

    private TrainEngine engine;

    public StartEngineCommand(TrainEngine reciever) {
        this.engine = reciever;
    }

    @Override
    public void execute() {
        this.engine.startEngine();
    }
}
