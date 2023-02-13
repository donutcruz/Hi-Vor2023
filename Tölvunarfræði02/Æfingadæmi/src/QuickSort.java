/******************************************************************************
 *  Nafn    : Donn Eunice Bartido Patambag / Donna Cruz
 *  T-póstur: deb5@hi.is
 *
 *  Lýsing  :
 *
 *
 *****************************************************************************/

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }

    private void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}


