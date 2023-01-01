package org.example.sort;

public interface InsertionSort {
    static Long InsertionSort(int[] input) {
        long start = System.nanoTime();
        int[] destinationArray = new int[input.length];
        int destinationSize = 0;

        for (int i : input) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize
                        && destinationArray[insertIndex] < i) {
                    insertIndex++;
                }
            }
            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = i;
            destinationSize++;
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
