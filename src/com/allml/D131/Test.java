package com.allml.D131;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(bindarySearch(arr, 7));
        //java自带的二分查找的静态方法
//        System.out.println(Arrays.binarySearch(arr, 9));
    }

    public static int bindarySearch(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] > data) {
                right = middle - 1;
            } else if (arr[middle] < data) {
                left = middle + 1;
            }else {
                return arr[middle];
            }
        }
        return -1;
    }
}
