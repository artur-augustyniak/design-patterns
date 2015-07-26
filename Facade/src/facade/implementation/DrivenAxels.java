/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.implementation;

/**
 *
 * @author artur
 */
public class DrivenAxels {

    public void setRotations(int torque) {
        double rpm = torque / 150;
        System.out.println("Driven axels rpm is " + rpm);
    }
}
