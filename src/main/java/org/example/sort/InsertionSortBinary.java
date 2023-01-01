package org.example.sort;

import java.util.Arrays;

public interface InsertionSortBinary {
    static long InsertionSortBinary(int[] array) {
        long start = System.nanoTime();

        for (int i = 1; i < array.length; i++) {
                int x = array[i];
                int j = Math.abs(
                        Arrays.binarySearch(array, 0,
                                i, x) + 1);
                System.arraycopy(array, j,
                        array, j + 1, i - j);
                array[j] = x;
            }
        long finish = System.nanoTime();
        return finish - start;
        }
}
