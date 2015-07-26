/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.model;

/**
 *
 * @author artur
 */
public interface Train {

    void forward(int velocity);

    void stop(int breakePower);

    void backward(int velocity);
}
