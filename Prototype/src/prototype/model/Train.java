/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.model;

/**
 *
 * @author artur
 */
public abstract class Train implements Cloneable {

    protected int identifier;

    @Override
    public Object clone() {
        try {
            Train copy = (Train) super.clone();
            return copy;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setIdentifier(int id) {
        this.identifier = id;
    }

    public abstract String getName();
}
