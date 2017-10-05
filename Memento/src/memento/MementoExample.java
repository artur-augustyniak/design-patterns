package memento;

import memento.model.Memento;
import memento.model.TrainOriginator;


/**
 * @author artur
 */
public class MementoExample {

    /**
     * undo/redo example
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TrainOriginator train = new TrainOriginator();

        train.setOrigin("Warszawa");
        Memento m1 = train.saveToMemento();
        train.setDestination("Rzeszów");
        System.out.println(train.getRelation());

        Memento m2 = train.saveToMemento();

        train.setOrigin("Gdańsk");
        train.setDestination("Radom");
        System.out.println(train.getRelation());

        train.restoreFromMemento(m1);
        System.out.println(train.getRelation());

        train.restoreFromMemento(m2);
        System.out.println(train.getRelation());
    }
}
