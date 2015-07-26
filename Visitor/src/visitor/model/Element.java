/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.model;

/**
 *
 * @author artur
 */
public interface Element {
    public void accept(Visitor v);
}
