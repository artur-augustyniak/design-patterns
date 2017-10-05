package memento.model;

/**
 * @author artur
 */
public class Memento {

    private final String savedOrigin;
    private final String savedDestination;

    public Memento(String savedOrigin, String savedDestination) {
        this.savedOrigin = savedOrigin;
        this.savedDestination = savedDestination;
    }

    public String getSavedOrigin() {
        return savedOrigin;
    }

    public String getSavedDestination() {
        return savedDestination;
    }
}
