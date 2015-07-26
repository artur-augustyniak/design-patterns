/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import visitor.implementation.PassengerArea;
import visitor.implementation.SnackSalesman;
import visitor.implementation.StaffArea;
import visitor.model.Element;
import visitor.model.Visitor;

/**
 *
 * @author artur
 */
public class VisitorClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Element[] someDataStructureOrCollection = {new PassengerArea(), new StaffArea()};
        Visitor saleseman = new SnackSalesman();
      
        for (Element element : someDataStructureOrCollection) {
            element.accept(saleseman);
        }
        
    }
}
