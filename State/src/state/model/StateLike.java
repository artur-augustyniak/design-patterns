/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state.model;

/**
 * Abstract tool component
 *
 * @author artur
 */
public interface StateLike {

    void writeName(StateContext context, String name);
}
