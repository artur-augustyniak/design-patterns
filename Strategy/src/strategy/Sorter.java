/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author artur
 */
public class Sorter {

    private ExampleStrategy sortStrategy;

    public void setSortStrategy(ExampleStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public Integer[] sortArray(Integer[] arrayToSort) {

        return this.sortStrategy.sort(arrayToSort);

    }
}
