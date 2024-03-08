package com.allml.D176;

public class myThread extends Thread {
    public myThread() {
    }

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println(t.getName() + ":" + i);
        }
    }
}
