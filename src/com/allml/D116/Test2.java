package com.allml.D116;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(1,"hfkahk","gdUSGDy",new double[]{32.4,0.23,123.2});

        User u2 = (User) u1.clone();
        System.out.println(u2.getId());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
        System.out.println(u2.getUsername());

        System.out.println(u1.getId());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println(u1.getUsername());
    }
}
