/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.model;

/**
 *
 * @author artur
 */
public class Originator {

    private State state;

    public void set(State state) {
        System.out.println("Originator: Setting state to " + state.getOrigin() + " " + state.getDestination());
        this.state = state;
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state.getOrigin() + " " + state.getDestination());
    }
}
