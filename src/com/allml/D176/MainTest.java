package com.allml.D176;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MainTest {
    public static void main(String[] args) throws Exception{
//        Callable<String> myCallable1 = new MyCallable(100);
//        FutureTask<String> f1 = new FutureTask<>(myCallable1);
//        new Thread(f1).start();
//
//
//        String s1 = f1.get();
//        System.out.println(s1);

        Thread t1 = new myThread();
        //setName在启动之前
        t1.setName("0007");
        t1.start();
        //要写一个有参构造器
        Thread t2 = new myThread("2号线程");
        t2.start();

        Thread m = Thread.currentThread();
        //主线程也能改名
        m.setName("mainmainmain");
        for (int i = 0; i < 3; i++) {
            Thread.sleep(50);
            System.out.println(m.getName() + ":"+ i);

        }

    }
}
