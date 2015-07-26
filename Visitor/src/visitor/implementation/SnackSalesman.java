/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.implementation;

import visitor.model.Visitor;

/**
 *
 * @author artur
 */
public class SnackSalesman implements Visitor{

    @Override
    public void visit(PassengerArea a) {
        System.out.println("Salesman Visitor trying to sell coffe and snacks to " + a.getCustomers() + " passangers." );
    }

    @Override
    public void visit(StaffArea a) {
        System.out.println("Salesman Visitor trying to sell coffe to " + a.getCustomers() + " staff members." );
    }
    
}
