/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Random;
import observer.implementation.Train;
import observer.implementation.TrainObserver;

/**
 * http://en.wikipedia.org/wiki/Observer_pattern
 * @author artur
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        TrainObserver disp = new TrainObserver();
        Train[] trains = {new Train("Warszawa", "Zakopane"), new Train("Gdańsk", "Katowice"), new Train("Lublin", "Konin")};
        for (Train train : trains) {
            train.addObserver(disp);
        }
        String[] newTo = {"Skierniewice", "Włoszczowa", "Malbork"};
        String[] newFrom = {"Władysławowo", "Koło", "Belgrad"};

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            String someTrainState = trains[rand.nextInt(trains.length)].getState();
            System.out.println(someTrainState);
            Integer randomIdx = rand.nextInt(trains.length);
            
            if (rand.nextInt(trains.length) > 0) {
                trains[randomIdx].setTo(newTo[rand.nextInt(trains.length)]);
                trains[randomIdx].setFrom(newFrom[rand.nextInt(trains.length)]);
            }

            Thread.sleep(500);
        }
    }
}
