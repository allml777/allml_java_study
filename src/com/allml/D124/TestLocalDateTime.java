package com.allml.D124;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //可以转换成LocalDate或LocalTime对象
        LocalDate ld123 = ldt.toLocalDate();
        System.out.println(ld123);
        LocalTime lt123 = ldt.toLocalTime();
        System.out.println(lt123);

        //还可以合并对象
        LocalDateTime ltdUP = LocalDateTime.of(ld123,lt123);
        System.out.println(ltdUP);


    }
}
