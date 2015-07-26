/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author artur
 */
public class BubbleSortStrategy implements ExampleStrategy {

    @Override
    public Integer[] sort(Integer[] a) {
        int size = a.length - 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < size; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            size--;
        }
        return a;
    }
}
