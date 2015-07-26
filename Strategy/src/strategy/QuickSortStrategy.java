/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author artur
 */
public class QuickSortStrategy implements ExampleStrategy {

    private Integer[] arrHandle;

    @Override
    public Integer[] sort(Integer[] unsorted) {

        this.arrHandle = unsorted;
        this.quicksort(this.arrHandle, 0, this.arrHandle.length - 1);
        return arrHandle;
    }

    private void quicksort(Integer[] a, int lo, int hi) {
        int i = lo, j = hi, h;
        int x = a[(lo + hi) / 2];
        do {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            if (i <= j) {
                h = a[i];
                a[i] = a[j];
                a[j] = h;
                i++;
                j--;
            }
        } while (i <= j);
        if (lo < j) {
            quicksort(a, lo, j);
        }
        if (i < hi) {
            quicksort(a, i, hi);
        }
    }
}
