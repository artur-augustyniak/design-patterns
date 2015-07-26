/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.implementation;

import visitor.model.Element;
import visitor.model.Visitor;

/**
 *
 * @author artur
 */
public class PassengerArea implements Element {

    private Integer customers = 1000;

    public Integer getCustomers() {
        return customers;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
