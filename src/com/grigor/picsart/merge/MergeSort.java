package com.grigor.picsart.merge;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, -4, 2, 56, 23, 44, 7};
        System.out.println("Before sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
        sort(array);
        System.out.println("\nAfter sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] part1 = new int[mid];
            int[] part2 = new int[array.length - mid];
            for (int i = 0; i < part1.length; i++) {
                part1[i] = array[i];
            }
            sort(part1);
            for (int i = 0, j = mid; i < part2.length; i++, j++) {
                part2[i] = array[j];
            }
            sort(part2);
            merge(part1, part2, array);
        }
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int indexA = 0, indexB = 0, indexC = 0;
        while (indexA < a.length || indexB < b.length) {
            if (indexB == b.length || (indexA < a.length && a[indexA] < b[indexB])) {
                c[indexC++] = a[indexA++];
            } else {
                c[indexC++] = b[indexB++];
            }
        }
    }
}
