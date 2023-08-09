package com.allml.D118;

import java.util.StringJoiner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11, 22, 33}));


    }

////    使用StringBuilder拼接字符串
//    public static String getArrayData(int[] arr) {
////        1、判断arr是否非空
//        if (arr == null) {
//            return null;
//        }
////        2、arr存在。arr = [11, 22, 33]
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                sb.append(arr[i]);
//            }else {
//                sb.append(arr[i]).append(", ");
//            }
//        }
//        sb.append("]");
//
//        return sb.toString();
//    }

    public static String getArrayData(int[] arr) {
        if (arr == null) {
            return null;
        }

        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
