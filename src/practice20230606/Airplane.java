package practice20230606;

import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入价格： ");
        double AirPrice = sc.nextDouble();
        System.out.println("输入月份（输入1-12的整数）： ");
        int month = sc.nextInt();
        System.out.println("是否头等舱（0为否，1为是）： ");
        boolean AirFlag = sc.nextBoolean();



    }

    public static double getPrice(double a,int b,boolean c){
        double final_price;
        if(b>=5 && b<=10){
            if(c){
                final_price = a*0.9;
            }else {
                final_price = a*8.85;
            }
        }else {
            if(c){
                final_price = a*0.7;
            }else {
                final_price = a*0.65;
            }
        }
        return final_price;
    }
}
