package com.allml.D126;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class TestArrays {
    public static void main(String[] args) {
        //toString()
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        //copyOfRange()范围包前不包后
        int[] ints = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(ints));

        //copyOf()拷贝并指定数组长度
        int[] ints1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(ints1));

        //setAll()把数组中的原数据改为新数据又存进去
        double[] prices = {100.1,99.9,21};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                //value会取数组的索引
                //在元数据的基础上成80%，出现错误就用bigdecimal运算
                return prices[value]*0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        //sort()
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));

    }
}
