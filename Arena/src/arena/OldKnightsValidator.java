/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arena;

/**
 *
 * @author aaugustyniak
 */
class OldKnightsValidator implements KnightValidator {

    public boolean validate(Knight knight) {

        return knight.getAge() > 60;
    }

}
