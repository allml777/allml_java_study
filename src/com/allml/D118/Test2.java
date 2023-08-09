package com.allml.D118;

public class Test2 {
    public static void main(String[] args) {
//        拼接100w次abc
//        String rs = "";
//        for (int i = 0; i < 1000000; i++) {
//            rs += "abc";
//        }
//
//        System.out.println(rs);

//        使用StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

    }
}
