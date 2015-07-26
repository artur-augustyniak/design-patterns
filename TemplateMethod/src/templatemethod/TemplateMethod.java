/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import templatemethod.implementation.AcceleratingProcess;
import templatemethod.implementation.BreakingProcess;
import templatemethod.model.AbstactProcess;

/**
 *
 * @author artur
 */
public class TemplateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstactProcess[] thingsToDo = {new AcceleratingProcess(), new BreakingProcess()};
        for (AbstactProcess process : thingsToDo) {
            process.runProcess();
        }
    }
}
