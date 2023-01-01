package org.example.sort;

public interface ShellSort {
    static long shellSort(int[] array) {
        long start = System.nanoTime();
        int h = 1;
        while (h < array.length) h = 3 * h + 1;

        while (h > 0) {
            h = h / 3;
            for (int k = 0; k < h; k++) {
                for (int i = h + k; i < array.length; i += h) {
                    int key = array[i];
                    int j = i - h;
                    while (j >= 0 && array[j] > key) {
                        array[j + h] = array[j];
                        j -= h;
                    }
                    array[j + h] = key;
                }
            }
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
