package com.allml.D124;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDate {
    public static void main(String[] args) {
        //LocalDate LocalTime LocalDateTime(recommand)
        //都使用now（）来调用
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();
        System.out.println("" + year + month + day + " " + dayOfWeek + " " + dayOfYear);

        //直接修改某个信息，在jdk8的时间类中一般以with开头 withYear withMonth withDayOfMonth withDayOfYear
        //可以看到ld的信息并没有修改
        ld.withYear(2100);
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(11);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ld3);

        //plus某个数据加
        LocalDate ld4 = ld.plusYears(2);
        System.out.println(ld4);

        //minus某个数据减
        LocalDate ld5 = ld.minusYears(2);
        System.out.println(ld5);

        //获取指定日期的LocalDate对象 of()
        LocalDate ld6 = LocalDate.of(2077,11,11);
        LocalDate ld7 = LocalDate.of(2077,11,11);
        System.out.println(ld6);

        //判断两个日期对象是否相等 equals isBefore isAfter
        System.out.println(ld6.equals(ld7));
        System.out.println(ld6.isBefore(ld7));
        System.out.println(ld6.isAfter(ld7));

    }
}
