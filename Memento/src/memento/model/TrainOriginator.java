package memento.model;

/**
 * @author artur
 */
public class TrainOriginator {

    private String origin;
    private String destination;


    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Memento saveToMemento() {
        System.out.println("TrainOriginator: Saving to Memento.");
        return new Memento(this.origin, this.destination);
    }

    public void restoreFromMemento(Memento memento) {
        System.out.println("TrainOriginator: Restoring Memento.");
        origin = memento.getSavedOrigin();
        destination = memento.getSavedDestination();
    }

    public String getRelation() {
        return "TrainOriginator: relation is  " + origin + " " + destination;
    }

}
