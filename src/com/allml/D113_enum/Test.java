package com.allml.D113_enum;

public class Test {
    public static void main(String[] args) {
        check(Constant.BOY);
    }

    public static void check(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("man");
                break;
            case GIRL:
                System.out.println("woman");
                break;
        }
    }
}
