package com.allml.D117;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects��ĳ��÷���
        String s1 = null;
        String s2 = "dafafg";

//        �����s1��equals�����ᱨ��objects�ľ�̬�����Ͳ���
//        System.out.println(s1.equals(s2));
//        �����Ƽ�ʹ��Objects��equals
        System.out.println(Objects.equals(s1, s2));

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        System.out.println(Objects.nonNull(s2));
        System.out.println(Objects.nonNull(s1));

    }
}
