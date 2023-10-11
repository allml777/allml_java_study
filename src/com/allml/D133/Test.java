package com.allml.D133;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        checkTime();
    }

    public static void checkPhone() {
        while (true) {
            System.out.println("输入手机号");
            Scanner sc = new Scanner(System.in);

            String phone = sc.nextLine();
            //校验手机号码
            if (phone.matches("([1][3-9]\\d{9})|([0]\\d{2,7}-?[1-9]\\d{4,19})|()")) {
                System.out.println("tel true");
            } else System.out.println("tel false");
        }
    }

    public static void checkEmail(){
        while (true) {
            System.out.println("输入email");
            Scanner sc = new Scanner(System.in);

            String email = sc.nextLine();
            //校验邮箱号码
            if (email.matches("\\w{2,}@\\w{2,20}\\.com(\\.cn)?")) {
                System.out.println("email true");
            } else System.out.println("email false");
        }
    }

    public static void checkTime(){
        while (true) {
            System.out.println("输入time hh-mm-ss");
            Scanner sc = new Scanner(System.in);

            String aTime = sc.nextLine();
            //校验时间
            if (aTime.matches("([01]\\d|20|21|22|23)-[0-5]\\d-[0-5]\\d")) {
                System.out.println("time true");
            } else System.out.println("time false");
        }
    }
}
