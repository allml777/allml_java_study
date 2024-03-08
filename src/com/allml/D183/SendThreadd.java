package com.allml.D183;

import java.util.List;
import java.util.Random;

public class SendThreadd extends Thread {
    private List<String> giftpool;
    private int count;

    public SendThreadd(List<String> giftpool, String name) {
        super(name);
        this.giftpool = giftpool;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Random r = new Random();
        while (true) {
            synchronized (giftpool) {
                if (giftpool.size() < 10) {
                    break;
                }
                String removeName = giftpool.remove(r.nextInt(giftpool.size()));
                count++;
                System.out.println(name + "拿走了" + removeName);
            }
        }
    }
}
