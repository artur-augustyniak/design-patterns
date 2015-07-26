/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.model;

/**
 *
 * @author artur
 */
public class Memento {

    private final State state;

    public Memento(State stateToSave) {
        state = (State) stateToSave.clone();
    }

    public State getSavedState() {
        return state;
    }
}
