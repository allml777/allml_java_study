package com.allml.D132;

public class RegexTest1 {
    public static void main(String[] args) {
        String qq = " ";
        System.out.println(checkQQ(qq));
        System.out.println("---------------");
        System.out.println(checkQQ1("hsdkfhk"));
        System.out.println(checkQQ1("13651876538"));

    }

    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        //判空
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //判断是否是纯数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

}
