package com.allml.D151.Q2;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//可以用split简化
public class Test1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Long> ids = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> genders = new ArrayList<>();
        List<LocalDate> birthdays = new ArrayList<>();

        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        //匹配编号的正则表达式
        String numberRegex = "[1][0]\\d{3}";
        //匹配姓名的正则表达式
        String nameRegex = "[\\u4E00-\\u9FA5]{2,5}(?:·[\\u4E00-\\u9FA5]{2,5})*";
        //匹配性别的正则表达式
        String sexRegex = "['男|女']";
        //匹配生日的正则表达式
        String birthdayRegex = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";

        Pattern numberP = Pattern.compile(numberRegex);
        Pattern nameP = Pattern.compile(nameRegex);
        Pattern sexP = Pattern.compile(sexRegex);
        Pattern birthdayP = Pattern.compile(birthdayRegex);

        Matcher numberM = numberP.matcher(userStrs);
        Matcher nameM = nameP.matcher(userStrs);
        Matcher sexM = sexP.matcher(userStrs);
        Matcher birthdayM = birthdayP.matcher(userStrs);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (numberM.find()) {
            Long id = Long.parseLong(numberM.group());
            ids.add(id);
        }

        while (nameM.find()) {
            String name = nameM.group();
            names.add(name);
        }

        while (sexM.find()) {
            String sex = sexM.group();
            genders.add(sex);
        }

        while (birthdayM.find()) {
            LocalDate localDate = LocalDate.parse(birthdayM.group());
            birthdays.add(localDate);
        }

        for (int i = 0; i < ids.size(); i++) {
            User user = new User(ids.get(i), genders.get(i), names.get(i), birthdays.get(i));
            users.add(user);
        }

        Map<String, Integer> nameSum = new HashMap<>();

        for (User user : users) {
            if (nameSum.containsKey(user.getName())) {
                int value = nameSum.get(user.getName());
                nameSum.put(user.getName(), value+1);
            } else {
                nameSum.put(user.getName(), 1);
            }
        }

        nameSum.forEach((o1, o2) -> System.out.println(o1 + ":\t" + o2));
    }
}
