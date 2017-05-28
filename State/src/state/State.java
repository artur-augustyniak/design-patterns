/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Random;


import state.model.StateContext;


/**
 * http://en.wikipedia.org/wiki/State_pattern
 *
 * @author artur
 */
public class State {

    public static void main(String[] args) {
        final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}
