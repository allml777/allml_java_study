package com.allml.d1_static;

public class StaticFileDemo1 {
    public static void main(String[] args) {
        System.out.println(User.onlineNumber);

        User u = new User();
        System.out.println(u.onlineNumber);
    }
}
