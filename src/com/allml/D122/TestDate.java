package com.allml.D122;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        String start = "2023年09月09日 00:00:00";
        String end = "2023年09月09日 00:10:00";
        String xj = "2023年09月09日 00:01:00";
        String xp = "2023年09月09日 00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date xjDt = sdf.parse(xj);
        Date xpDt = sdf.parse(xp);

//        把日期转成时间毫秒值
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long xjTime = xjDt.getTime();
        long xpTime = xpDt.getTime();

        if (xjTime >= startTime && xjTime <= endTime){
            System.out.println("xj success");
        }else {
            System.out.println("xj false");
        }

        if (xpTime >= startTime && xpTime <= endTime){
            System.out.println("xp success");
        }else {
            System.out.println("xp false");
        }
    }
}
