package com.allml.d1_static;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

public class Student {
    private String name;

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public void study(){
        System.out.println(name+"good good study day day up");
    }

    public static void main(String[] args) {
        System.out.println(Student.getMax(10, 3));

        System.out.println(getMax(11, 22));

//        study();
        Student s = new Student();
        s.name = "aaa";
        s.study();
    }
}
