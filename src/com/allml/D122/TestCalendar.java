package com.allml.D122;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        //Calendar是抽象类
        Calendar rightNow = Calendar.getInstance();
        //直接打印会显示日历所有信息
        System.out.println(rightNow);
        //get调Calendar中的常量
        System.out.println(rightNow.get(Calendar.ERA));

        //拿到日历中记录的日期对象
        Date d = rightNow.getTime();
        System.out.println(d);

        //拿到时间毫秒值
        long time = rightNow.getTimeInMillis();
        System.out.println(time);

        //修改日历中的某个信息,月份从0开始计算
        rightNow.set(Calendar.YEAR, 10);
        System.out.println(rightNow.get(Calendar.YEAR));

        //为某个信息增加或者减少多少
        rightNow.add(Calendar.DAY_OF_YEAR, 55);
        System.out.println(rightNow);
        rightNow.add(Calendar.DAY_OF_YEAR, -55);
        System.out.println(rightNow);

    }
}
