package com.allml.D179;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<String>();


    public synchronized void put() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 0) {
                System.out.println(name + "放入一个包子");
                list.add(name + "的一个包子");
                Thread.sleep(2000);
                //先唤醒再wait
                this.notifyAll();
                this.wait();
            } else {
//                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1) {
                System.out.println(name + "拿走一个包子");
                list.clear();
                Thread.sleep(1000);
                this.notifyAll();
                this.wait();
            } else {
//                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
