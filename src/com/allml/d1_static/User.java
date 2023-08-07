package com.allml.d1_static;

public class User {
    /**
     * static在内存中只有一份
     */
    public static int onlineNumber = 111;
    private String name;
    private int age;

    public static void main(String[] args) {

        User u = new User();
        u.name = "aaa";
    }
}
