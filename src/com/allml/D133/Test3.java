package com.allml.D133;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "古力娜扎hdskjghkj迪丽热巴sxcjgvkslh4123马儿扎哈143214dasf卡尔扎巴";
        System.out.println(s1.replaceAll("\\w+", "-"));

        //去除重复字
        /**
         * (.)一组:.匹配任意关键字
         * \\1:为前面这个括号内的组声明组号
         * +:声明必须是重复的关键字（即出现一次及以上）
         * $1:取到前面这个第一组代表的重复字
         */
        String s2 = "我我我我喜欢编编编编程程程";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        //把一堆文字中的人民获取出来  split分割字符串返回一个字符串数组
        String s3 = "古力娜扎hdskjghkj迪丽热巴sxcjgvkslh4123马儿扎哈143214dasf卡尔扎巴";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
