package com.allml.D116;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("aa",11);
        Student s2 = new Student("aa",11);

        System.out.println(s1.toString());
        System.out.println(s2.equals(s1));

    }
}
