package com.allml.D128;

import java.util.Arrays;

public class TestLambda {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("van",180,25);
        students[1] = new Student("bili",181,25);
        students[2] = new Student("田所浩二",180,24);
        students[3] = new Student("木吉",177,28);

        //Lambda表达式简化
        Arrays.sort(students,(o1,o2)-> o1.getAge()- o2.getAge());

        //静态方法引用继续简化
        //Arrays.sort(students,(o1,o2)->CompareByData.compareByAge(o1,o2));
        Arrays.sort(students,CompareByData::compareByAge);

        //实例方法引用
        CompareByData compare = new CompareByData();
//        Arrays.sort(students,(o1,o2)-> compare.compaareByAgeDesc(o1,o2));
        Arrays.sort(students,compare::compaareByAgeDesc);

        for (Student e:students
             ) {
            System.out.println(e.getAge());
        }
    }
}
