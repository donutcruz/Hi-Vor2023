/******************************************************************************
 *  Nafn    : Donn Eunice Bartido Patambag / Donna Cruz
 *  T-póstur: deb5@hi.is
 *
 *  Lýsing  : 1. [Mergesort]  Rekjið ykkur í gegnum merge-fallið fyrir 12-staka fylkið
 *  [A E Q S U Y E I N O S T].
 *  Sýnið stöðuna eftir hverja ítrun, svipað og í myndinni á glæru 5 í fyrirlestri 9 (líka á
 * bls. 271 í kennslubókinni).
 *
 *
 *****************************************************************************/

import java.util.Arrays;

public class MergeSort {
    /* int array [] array = {12,11,13,5,6,7} = Fylki
     * MergeSort mergeSort = new MergeSort(); býr til tilvik  og úthlutar því við tilviksbreytuna mergSort
     * mergeSort.sort(array, 0, array.length - 1); Flokkunar aðgerð flokkar fylkið með því að nota samrunaflokkunaralgrímið
     * Println(\nSortedArray); gefur út strenginn \nSortedArray
     * println(Arrays.toString(array)); Prentar raðað fylki .*/

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(array));
    }

    private void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
