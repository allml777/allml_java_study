package com.allml.D120;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        //掌握bigdecimal的使用，解决小数运算失真问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("-------------------------------------------");

        //这种写法可以优化
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));

        //可以直接调用bigdecimal的valueof方法
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        BigDecimal c2 = a1.subtract(b1);
        BigDecimal c3 = a1.multiply(b1);
        BigDecimal c4 = a1.divide(b1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("-------------------------------------------");

        //devide有一些精度上的问题
        BigDecimal c5 = BigDecimal.valueOf(0.1);
        BigDecimal c6 = BigDecimal.valueOf(0.3);
        BigDecimal c7 = c5.divide(c6, 3, RoundingMode.HALF_UP);

        System.out.println(c7);
        System.out.println(c7);

    }
}
