package org.example.sort;

public interface BubbleSort {
    static long bubbleSort(int[] sortArr) {
        long start = System.nanoTime();

        for (int i = 0; i < sortArr.length; i++)
        {
            for (int j = 0; j < sortArr.length - 1; j++)
            {
                if (sortArr[j] > sortArr[j + 1])
                {
                    int t = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    sortArr[j] = t;
                }
            }
        }
        long finish = System.nanoTime();
        return finish - start;
    }
}
