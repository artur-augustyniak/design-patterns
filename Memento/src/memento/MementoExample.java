/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import memento.model.CareTaker;
import memento.model.Originator;
import memento.model.State;

/**
 *
 * @author artur
 */
public class MementoExample {

    /**
     * http://pl.wikipedia.org/wiki/Pami%C4%85tka_%28wzorzec_projektowy%29
     * undo/redo example
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator train = new Originator();
        State state = new State();
        state.setOrigin("Warszawa");
        state.setDestination("Rzeszów");
        train.set(state);
        careTaker.add(train.saveToMemento());
        state.setOrigin("Warszawa");
        state.setDestination("Radom");
        train.set(state);
        careTaker.add(train.saveToMemento());

        for (int i = 0; i < careTaker.getMementosLength(); i++) {
            train.restoreFromMemento(careTaker.get(i));
        }
    }
}
