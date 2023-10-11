package com.allml.D130;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] aSort = {1, 2, 3, 4, 5, 6};

//        int[] bSort = maopao(aSort);
        int[] bSort = xuanze(aSort);

        System.out.println(Arrays.toString(bSort));
    }


    private static int[] maopao(int[] aSort) {
        for (int i = 0; i < aSort.length - 1; i++) {
            for (int i1 = 0; i1 < aSort.length - i - 1; i1++) {
                if (aSort[i1] < aSort[i1 + 1]) {
                    int j = aSort[i1];
                    aSort[i1] = aSort[i1 + 1];
                    aSort[i1 + 1] = j;
                }
            }
        }
        return aSort;
    }

    private static int[] xuanze(int[] aSort) {
        for (int i = 0; i < aSort.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < aSort.length; j++) {
                if (aSort[minIndex] < aSort[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = aSort[i];
                aSort[i] = aSort[minIndex];
                aSort[minIndex] = temp;
            }
        }

        return aSort;
    }

}
