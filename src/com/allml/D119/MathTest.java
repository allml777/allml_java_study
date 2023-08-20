package com.allml.D119;

public class MathTest {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(-0.12));
        System.out.println(Math.abs(1112));
        //向上取整
        System.out.println(Math.ceil(4.00000001));
        System.out.println(Math.ceil(-4.00000001));
        System.out.println(Math.ceil(4.0000));
        System.out.println(Math.ceil(-4.0000));
        //向下取整
        System.out.println(Math.floor(4.9999999999));
        System.out.println(Math.floor(-4.9999999999));
        System.out.println(Math.floor(4.0));
        System.out.println(Math.floor(-4.0));
        //四舍五入
        System.out.println(Math.round(3.4999));
        System.out.println(Math.round(3.5001));
        //取最大/小值
        System.out.println(Math.max(11, 22));
        System.out.println(Math.min(11, 22));
        //取次方
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));
        //取随机数random包前不包后[0.0,1.0)
        System.out.println(Math.random());

    }
}
