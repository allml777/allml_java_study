package com.allml.D125;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestDuration {
    public static void main(String[] args) {
        //Duration计算持续时间
        Duration duration = Duration.between(LocalDateTime.of(2023,9,11,10,10,0),LocalDateTime.of(2023,10,10,11,12,13));
        System.out.println(duration.getSeconds());
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());

    }
}
