/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.model;

import flyweight.implementation.CariageCommonProperties;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author artur
 */
public class CarriageFactory {

    private static Map<String, CariageFlyweight> flyweights = new HashMap<String, CariageFlyweight>();

    public static CariageFlyweight getCariageFlyweight(String type) {
        CariageFlyweight fl = flyweights.get(type);
        if (fl == null) {
            fl = new CariageCommonProperties(type);
            flyweights.put(type, fl);
        }
        return fl;
    }

    public static Integer flCount() {
        return flyweights.size();
    }
}
