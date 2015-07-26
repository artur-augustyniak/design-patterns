/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.implementation;

import flyweight.model.CariageFlyweight;

/**
 *
 * @author artur
 */
public class CariageCommonProperties implements CariageFlyweight {

    private String type;

    public CariageCommonProperties(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
