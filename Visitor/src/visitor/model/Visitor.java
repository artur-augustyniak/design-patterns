/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.model;

import visitor.implementation.PassengerArea;
import visitor.implementation.StaffArea;

/**
 *
 * @author artur
 */
public  interface Visitor {
    
    
    public void visit(PassengerArea a);

    public void visit(StaffArea a);
}
