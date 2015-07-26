/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.implementation;

import iterator.model.ExampleIterator;

/**
 *
 * @author artur
 */
public class SomeObjectForcedToBeItrable implements ExampleIterator {

    private Integer nextPosition;
    /**
     * Some ugly implementation to show pattern pos.
     */
    private Integer someFirstChunk = 111;
    private Integer someSecondChunk = 222;
    private Integer someThirdChunk = 333;

    ;

    public SomeObjectForcedToBeItrable() {
        nextPosition = someFirstChunk;
    }

    @Override
    public boolean hasNext() {
        if (this.nextPosition == null) {
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        Integer currNext = this.nextPosition;
        if (currNext == someFirstChunk) {
            nextPosition = someSecondChunk;
        }
        if (currNext == someSecondChunk) {
            nextPosition = someThirdChunk;
        }
        if (currNext == someThirdChunk) {
            nextPosition = null;
        }
        return currNext;

    }
}
