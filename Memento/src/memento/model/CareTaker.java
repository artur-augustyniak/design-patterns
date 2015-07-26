/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public class CareTaker {

    private List<Memento> savedStates = new ArrayList<Memento>();

    public void add(Memento m) {
        savedStates.add(m);
    }

    public Memento get(int i) {
        return savedStates.get(i);
    }

    public int getMementosLength() {
        return savedStates.size();
    }
}
