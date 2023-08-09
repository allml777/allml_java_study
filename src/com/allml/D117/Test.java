package com.allml.D117;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects类的常用方法
        String s1 = null;
        String s2 = "dafafg";

//        如果用s1的equals方法会报错，objects的静态方法就不会
//        System.out.println(s1.equals(s2));
//        所以推荐使用Objects的equals
        System.out.println(Objects.equals(s1, s2));

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        System.out.println(Objects.nonNull(s2));
        System.out.println(Objects.nonNull(s1));

    }
}
