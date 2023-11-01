package com.allml.D143;

import java.util.Arrays;

public class ParamTest {
    public static void main(String[] args) {
        test();
        test(10);
        test(1, 2, 3);
        //也可以传数组
        test(new int[]{10, 20, 30, 40});
    }

    //可变参数，可以传多个
    /*注意事项
    1、一个形参列表中只能有一个可变参数（可以有其他数据类型，详见第2条）。
        (int...num1,int...nums)这样会报错 一个String一个int也不行
    2、可变参数必须放在形参列表最后面(int age,int...num)这样是可以的，反过来就不行
     */
    public static void test(int... nums) {
        //可变参数在方法内部本质是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------------");
    }
}
