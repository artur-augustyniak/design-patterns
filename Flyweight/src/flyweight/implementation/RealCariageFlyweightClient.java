/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.implementation;

import flyweight.model.CariageFlyweight;
import flyweight.model.CarriageFactory;

/**
 *
 * @author artur
 */
public class RealCariageFlyweightClient {

    private Integer load;
    private CariageFlyweight flyweight;

    public RealCariageFlyweightClient(Integer load, String type) {
        this.load = load;
        this.flyweight = CarriageFactory.getCariageFlyweight(type);
    }

    public void reportState() {
        System.out.println("This Cariage is Flyweight Client object");
        System.out.println("load " + load);
        System.out.println("type " + flyweight.getType());
    }
}
