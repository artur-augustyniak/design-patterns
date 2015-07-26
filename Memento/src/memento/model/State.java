/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.model;

/**
 *
 * @author artur
 */
public class State implements Cloneable {

    private String origin;
    private String destination;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public Object clone() {
        try {
            State copy = (State) super.clone();
            return copy;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
