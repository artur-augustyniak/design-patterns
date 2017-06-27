/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtering;

/**
 *
 * @author aaugustyniak
 */
class MaleKnightsValidator implements KnightValidator {

    public boolean validate(Knight knight) {
        String name = knight.getName();
        return name.charAt(name.length() - 1) != 'a';
    }

}
