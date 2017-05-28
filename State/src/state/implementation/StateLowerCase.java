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
public class StateLowerCase implements StateLike {
    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateMultipleUppercase());
    }
}
