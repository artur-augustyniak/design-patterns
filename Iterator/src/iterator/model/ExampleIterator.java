/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.model;

/**
 * extends Iterator<Object>
 * http://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
 *
 * @author artur
 */
public interface ExampleIterator {

    public boolean hasNext();

    public Integer next();
}
