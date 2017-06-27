/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.sort;

/**
 * http://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern
 *
 * @author artur
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] arr = {4, 3, 45, 654, 2, 4, 5, 2};
        Integer[] sorted;
        Sorter sort = new Sorter();
        sort.setSortStrategy(new BubbleSortStrategy());
        sorted = sort.sortArray(arr.clone());

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.print("\n");

        sort.setSortStrategy(new QuickSortStrategy());
        sorted = sort.sortArray(arr.clone());

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.print("\n");

    }
}
