package com.allml.D117;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
//        ���Ƽ�ʹ��
//        Integer a1 = new Integer(12);

        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

//        �Զ�װ����ƣ��Զ��ѻ�����������ת�ɶ���
        Integer a3 = 12;
//        �Զ�������ƣ��Զ��Ѱ�װ���͵Ķ���ת���ɻ�����������
        int a4 = a3;

//        ���ͺͼ��ϲ�֧�ֻ����������ͣ�ֻ֧����������
//        ArrayList<int> = new ArrayList<>();

        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);

        int ae = aa.get(1);
        System.out.println(ae);

        System.out.println("+++++++++++++++++++++++++++++");

//        1���ѻ������͵�����ת�����ַ���
        Integer a = 34;
        String rs1 = Integer.toString(a);
        System.out.println(rs1 + 1);

//        Integer�̳�object�����Լ̳���object��tostring
        String rs2 = a.toString();
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

//        2�����ַ������͵���ֵת��Ϊ��������
        String ageStr = "29a";
        try {
            int agei = Integer.valueOf(ageStr);
            System.out.println(agei + 1);
        }catch (Exception e){
            System.out.println("����ת��������");
        }



        String score = "11.11";
        double scorei = Double.valueOf(score);
        System.out.println(scorei + 0.5);
    }
}
