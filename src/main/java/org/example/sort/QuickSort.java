package org.example.sort;

public interface QuickSort {
    static long quickSort(int[] sortArr, int low, int high) {
        long start = System.nanoTime();
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];
        int i = low, j = high;

        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(sortArr, low, j);
        }
        if (high > i) {
            quickSort(sortArr, i, high);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
