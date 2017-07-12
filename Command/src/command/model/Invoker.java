/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public  class Invoker {

    protected List<Command> commandStack = new ArrayList<Command>();

    public void pushAndExecute(Command cmd) {
        this.commandStack.add(cmd);
        cmd.execute();
    }
}
