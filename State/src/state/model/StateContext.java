package state.model;

import state.implementation.StateLowerCase;

/**
 * Created by aaugustyniak on 28.05.17.
 */
public class StateContext {
    private StateLike myState;

    public StateContext() {
        setState(new StateLowerCase());
    }

    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     *
     * @param newState the new state of this context
     */
    public void setState(final StateLike newState) {
        myState = newState;
    }

    public void writeName(final String name) {
        myState.writeName(this, name);
    }

}
