/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.implementation;

import java.util.ArrayList;
import java.util.List;
import observer.model.ExampleObservable;
import observer.model.ExampleObserver;

/**
 *
 * @author artur
 */
public class Train implements ExampleObservable {

    private List<ExampleObserver> observers;
    private String from;
    private String to;

    public void setFrom(String from) {
        this.from = from;
        this.notifyObservers();
    }

    public void setTo(String to) {
        this.to = to;
        this.notifyObservers();
    }

    public Train(String from, String to) {
        this.observers = new ArrayList<ExampleObserver>();
        this.from = from;
        this.to = to;
    }

    @Override
    public void addObserver(ExampleObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(ExampleObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ExampleObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String getState() {
        return "Train " + this.toString() + " has relation " + this.from + " " + this.to;
    }
}
