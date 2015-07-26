/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.Random;

/**
 *
 * @author artur
 */
public class RandomizedEnviroment {

    public static Integer getRailwayGauge() {
        Integer[] gauges = {1600, 1435, 800};
        Random r = new Random();
        return gauges[r.nextInt(gauges.length)];

    }
}
