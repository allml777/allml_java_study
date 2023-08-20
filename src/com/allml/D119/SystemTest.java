package com.allml.D119;

public class SystemTest {
    public static void main(String[] args) {
//        System.exit(0);//人为终止vm虚拟机，一般不用
        System.out.println("dklaskda");

        //获取系统时间，返回一个long类型，是1970.1.1到现在的毫秒值，1 s = 1000 ms
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出：" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000.0 + "s");
    }
}
