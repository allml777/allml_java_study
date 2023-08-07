package com.allml.D112;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal(){

            @Override
            public void cry() {
                System.out.println("miao~miao~miao~");
            }
        };
        Animal b = new Test$1();
        b.cry();

        a.cry();
    }
}
