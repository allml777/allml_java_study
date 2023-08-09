package com.allml.D117;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
//        不推荐使用
//        Integer a1 = new Integer(12);

        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

//        自动装箱机制，自动把基本数据类型转成对象
        Integer a3 = 12;
//        自动拆箱机制，自动把包装类型的对象转换成基本数据类型
        int a4 = a3;

//        泛型和集合不支持基本数据类型，只支持引用类型
//        ArrayList<int> = new ArrayList<>();

        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);

        int ae = aa.get(1);
        System.out.println(ae);

        System.out.println("+++++++++++++++++++++++++++++");

//        1、把基本类型的数据转换成字符串
        Integer a = 34;
        String rs1 = Integer.toString(a);
        System.out.println(rs1 + 1);

//        Integer继承object，所以继承了object的tostring
        String rs2 = a.toString();
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

//        2、把字符串类型的数值转换为基本类型
        String ageStr = "29a";
        try {
            int agei = Integer.valueOf(ageStr);
            System.out.println(agei + 1);
        }catch (Exception e){
            System.out.println("不能转换非整数");
        }



        String score = "11.11";
        double scorei = Double.valueOf(score);
        System.out.println(scorei + 0.5);
    }
}
