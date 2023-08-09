package com.allml.D118;

public class Test {
    public static void main(String[] args) {
//        StringBuilder的操作
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder("itblackhorse");

//        1、拼接内容
        s.append(12);
        s.append("asgfa");
        s.append(true);

//        支持链式编程，对象会返回，比如这里s调用append，还是返回s
        s.append(666);
        System.out.println(s);

        System.out.println(s.reverse());

//        长度
        System.out.println(s.length());



    }
}
