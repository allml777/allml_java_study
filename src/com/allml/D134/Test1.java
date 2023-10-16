package com.allml.D134;

public class Test1 {
    public static void main(String[] args) {
//        Integer.valueOf("abc");

        try {
            int[] arr = {11,22,334};
            System.out.println(arr[5]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
