package org.example.sort;

public interface InsertionSortUpdated {
    static long InsertionSortUpdated(int[] sortArr) {
        long start = System.nanoTime();
        int j;

        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
