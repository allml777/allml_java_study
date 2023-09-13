package com.allml.D128;

public class CompareByData {
    public static int compareByAge(Student o1,Student o2){
        return o1.getAge()- o2.getAge();
    }

    public int compaareByAgeDesc(Student o1,Student o2){
        return o2.getAge()- o1.getAge();
    }
}
