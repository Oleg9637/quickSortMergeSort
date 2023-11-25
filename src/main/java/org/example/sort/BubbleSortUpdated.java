package org.example.sort;


public interface BubbleSortUpdated {
    static long bubbleSortUpdated(int[] sortArr) {
        long start = System.nanoTime();

        for (int i = 0; i < sortArr.length; i++)
        {
            boolean swapped = false;
            for (int j = 0; j < sortArr.length - i - 1; j++)
            {
                if (sortArr[j] > sortArr[j + 1])
                {
                    swapped = true;
                    int t = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    sortArr[j] = t;
                }
            }
            if (!swapped) break;
        }
        long finish = System.nanoTime();
        return finish - start;
    }

}
