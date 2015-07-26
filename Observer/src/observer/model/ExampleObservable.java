/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.model;

/**
 *
 * @author artur
 */
public interface ExampleObservable {

    void addObserver(ExampleObserver observer);

    void deleteObserver(ExampleObserver observer);

    public void notifyObservers();
    
    public String getState();
}
