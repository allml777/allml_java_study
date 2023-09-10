package com.allml.D123;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //传统时间类Date的问题
        Date d = new Date();
        //获取的年份要加1900才是正确的
        System.out.println(d.getYear()+1900);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        //传统时间类都是可变对象，容易丢失初始时间。

        //传统时间类是线程不安全的，很多人一起使用会产生冲突

        //不能精确到纳秒，只能到毫秒 秒这里的单位都是10^3，例如1s=1000ms


    }
}
