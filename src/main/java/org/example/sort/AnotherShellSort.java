package org.example.sort;

public interface AnotherShellSort {
    static long AnotherShellSort(int[] numbers) {
        long start = System.nanoTime();
        int j;

        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < numbers.length; i++) {
                int temp = numbers[i];
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap) {
                    numbers[j] = numbers[j - gap];
                }
                numbers[j] = temp;
            }
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
