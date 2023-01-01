package org.example;


import org.example.sort.*;

public class Main {
    public static void main(String[] args) {
        int[] tenThousand = new int[10000];
        for (int i = 0; i < tenThousand.length; i++) {
            tenThousand[i] = (int) (Math.random()* 300000);
        }
        int[] tenThousand1 = new int[10000];
        for (int i = 0; i < tenThousand1.length; i++) {
            tenThousand1[i] = (int) (Math.random()* 300000);
        }
        System.out.println(AnotherShellSort.AnotherShellSort(tenThousand));
        System.out.println(ShellSort.shellSort(tenThousand1));
    }
}