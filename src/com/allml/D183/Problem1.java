package com.allml.D183;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 需求描述:
 * 有100份礼品，小红，小明两人同时发送，当剩下的礼品小于10份的时候则不再送出，
 * 利用多线程模拟该过程并将线程的名称打印出来。并最后在控制台分别打印小红，小明各自送出多少分礼物。
 */
public class Problem1 {
    public static void main(String[] args) throws Exception {
        List<String> giftPool = new ArrayList<>();


        String[] giftClass = {"太阳能打火机", "酱菜罐头", "高级雪茄", "茅台", "咸菜罐头", "大吼一声"};
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            giftPool.add(giftClass[r.nextInt(giftClass.length)] + (i + 1));
        }

//        System.out.println(giftPool);
//        System.out.println(giftPool.size());

        SendThreadd xh = new SendThreadd(giftPool, "小红");
        SendThreadd xm = new SendThreadd(giftPool, "小明");

        xh.start();
        xm.start();

        xh.join();
        xm.join();

        System.out.println(xh.getCount());
        System.out.println(xm.getCount());
    }
}

