package com.allml.D151.Q3;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    //第一个休息的日期
    static String firstRestDate = "2022-02-03";
    static String startDate = "1900-01-01";

    public static void main(String[] args) {
        String endDate = "2023-11-13";

        String dateRegex = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
        Pattern pattern = Pattern.compile(dateRegex);

        String inputDate = "";
        while (true) {
            System.out.println("输入日期(格式yyyy-MM-dd)：");
            Scanner sc = new Scanner(System.in);
            inputDate = sc.next();
            Matcher matcher = pattern.matcher(inputDate);
            if (matcher.find()) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("请输入正确格式");
            }
        }

        LocalDate date = LocalDate.parse(inputDate);
        date = date.minusDays(date.getDayOfMonth()-1);
        int year = date.getYear();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date);

        int weekStart = date.getDayOfWeek().getValue();
//        System.out.println(weekStart);

        System.out.println("一\t二\t三\t四\t五\t六\t日");
        for (int i = 1; i < weekStart; i++) {
            System.out.print("\t");
        }

        //只要日期的当前月值为给定的月份值 ，就执行循环体
        while(date.getMonthValue() == month){
            //格式化输出当前日期在月份中的第几天
            System.out.printf("%3d",date.getDayOfMonth());
            //当前月份日期与，给定的日期相等时，则在后面加上*
            if(isRest(date)){
                System.out.print("*");
            }else{
                System.out.print("\t");
            }
            //每打印一个日期后，则把当前日期向后移一天
            date = date.plusDays(1);
            //如果当前日期，是一个星期的星期日，则打印一个换行符。
            if(date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
//        if(date.getDayOfWeek().getValue() != 1) System.out.println();

//        for (int i = 0; i < 5; i++) {
//            for (int i1 = 0; i1 < 7; i1++) {
//
//            }
//        }

    }

    /*
    判断日期是否在最初的休息日前
     */
    public static boolean isForward(String date) {
        LocalDate fld = LocalDate.parse(firstRestDate);
        LocalDate ld = LocalDate.parse(date);

        long days = ChronoUnit.DAYS.between(fld, ld);
        if ((int) days < 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
    判断是否是休息日
     */
    public static boolean isRest(LocalDate ld) {
        LocalDate fld = LocalDate.parse(firstRestDate);

        long days = ChronoUnit.DAYS.between(fld, ld);
        int judge = (int) days % 3;
        if (judge == 0) {
            return true;
        } else {
            return false;
        }
    }
}
