package com.allml.D177;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread() {
    }

    public DrawThread(String name) {
        super(name);
    }

    public DrawThread(String name,Account acc){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100000);
        super.run();
    }
}
