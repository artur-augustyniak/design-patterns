/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state.implementation;

import state.model.StateContext;
import state.model.StateLike;

/**
 * @author artur
 */
public class StateMultipleUppercase implements StateLike {
    /**
     * Counter local to this state
     */
    private int count = 0;

    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toUpperCase());
        /* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
        if (++count > 1) {
            context.setState(new StateLowerCase());
        }
    }
}