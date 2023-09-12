package com.allml.D125;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class TestPeriod {
    public static void main(String[] args) {
        LocalDate of = LocalDate.of(2029, 8, 11);
        //计算两个LocalDate的时间差
        LocalDate localDate = LocalDate.now();
        Period between = Period.between(localDate, of);

        //通过period获取相差
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());


    }
}
