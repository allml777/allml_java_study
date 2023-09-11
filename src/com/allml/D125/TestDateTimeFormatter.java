package com.allml.D125;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {
    public static void main(String[] args) {
        //传统SimpleDateFormat线程不安全
        //创建日期时间格式化器对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM-dd HH:mm:ss");
        //对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //正向格式化
        Instant now1 = Instant.now();
//        String fs =
                dateTimeFormatter.format(now);
        Instant now2 = Instant.now();
//        System.out.println(fs);

        //另一种格式化时间的方法，用LocalDateTime的format调日期格式化器对象（反向格式化）
        Instant now3 = Instant.now();
//        System.out.println(
                now.format(dateTimeFormatter);
//        );
        Instant now4 = Instant.now();

        int a1 = now4.getNano()-now3.getNano();
        int a2 = now2.getNano()-now1.getNano();
        System.out.println(now4.getNano());
        System.out.println(now3.getNano());

        //解析时间，一般用LocalDateTime提供的方法来解析
        String dateStr = "2023年09-10 00:00:00";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, dateTimeFormatter);
        System.out.println(ldt);


    }
}
