package com.allml.D118;

public class Test {
    public static void main(String[] args) {
//        StringBuilder�Ĳ���
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder("itblackhorse");

//        1��ƴ������
        s.append(12);
        s.append("asgfa");
        s.append(true);

//        ֧����ʽ��̣�����᷵�أ���������s����append�����Ƿ���s
        s.append(666);
        System.out.println(s);

        System.out.println(s.reverse());

//        ����
        System.out.println(s.length());



    }
}
