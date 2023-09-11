package com.allml.D124;

import java.time.Instant;

public class TestInstant {
    public static void main(String[] args) {
        //instant 时间戳 两部分组成 从19700101开始的总秒数+纳秒
        //优点在纳秒精确度高
        Instant instant = Instant.now();
        System.out.println(instant);

        //这就是两部分 从19700101开始的总秒数+纳秒
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        Instant plus1 = instant.plusNanos(111);
        Instant minus1 = instant.minusNanos(23);

        //用instant做代码的性能分析或用户操作的时间点
        Instant now = Instant.now();

    }
}
