package com.allml.D180;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return name + " is running, sum = " + sum;
    }
}
