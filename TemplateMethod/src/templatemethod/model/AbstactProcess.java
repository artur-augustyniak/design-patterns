/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod.model;

/**
 *
 * @author artur
 */
public abstract class AbstactProcess {

    public final void runProcess() {
        this.stepOne();
        this.stepTwo();
        this.stepThree();
        this.stepFour();
    }

    public final void stepOne() {
        System.out.println("This is final method, this first step of process is always present.");
    }

    protected abstract void stepTwo();

    protected abstract void stepThree();

    public final void stepFour() {
        System.out.println("This is final method, this last step of process is always present.");
    }
}
