package com.allml.D124;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class TestZoneId {
    public static void main(String[] args) {
        //获取默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId.toString());

        //获取java全部时区id
        System.out.println(ZoneId.getAvailableZoneIds());

        //把某个时区id封装成ZoneId对象
        ZoneId zoneId1 = ZoneId.of("America/New_York");
        System.out.println(zoneId1);

        //带时区的时间
        ZonedDateTime now = ZonedDateTime.now(zoneId1);
        System.out.println(now);

        //世界标准时间
        ZonedDateTime UTCTime = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(UTCTime);

        //ZonedDateTime.now()什么参数都不传就是系统时间

        //带时区的时间的加减和LocalDateTime类似，也是不可变对象，用plus、minus等方法

        //传统方法使用时区
//        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId));
    }
}
