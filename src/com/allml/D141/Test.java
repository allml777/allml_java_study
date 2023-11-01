package com.allml.D141;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(9);
        set1.add(5);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        //就近选择比较器排序
//        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });
        Set<Student> students = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));

        students.add(new Student("van", 27, 188.8));
        students.add(new Student("bili", 28, 187.8));
        students.add(new Student("li tiansuo", 24, 177.8));
        students.add(new Student("chunping", 25, 176.8));

        System.out.println(students);

    }
}
