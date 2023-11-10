package com.allml.D150;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javax.annotation.processing.Completions.of;

public class StreamTest {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 89.3, 100.0, 9.5, 99.3);
        scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白品品", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
//        students.stream().filter(s -> s.getAge() <= 30 && s.getAge() >= 23)
//                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
//                .forEach(s -> System.out.println(s));

        System.out.println("----------------------------------------");

        //limit(int n)会返回前n个
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .limit(3)
//                .forEach(s -> System.out.println(s));//等效的(还能简写)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        //正序排序之后跳过前几个用skip
        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())))
                .skip(students.size() - 2)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        //超过180去除重复名字
        students.stream().filter(s -> s.getHeight() > 168)
//                .map(s -> s.getName()//等效
                .map(Student::getName)
                //Distinct()用来去重
                .distinct()
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        Stream<String> st1 = Stream.of("hsaf", "asfasf");
        Stream<String> st2 = Stream.of("fdsfsdg", "afsag", "dsgfyiioqadfhi");
        Stream<String> allSt = Stream.concat(st1, st2);
        allSt.forEach(System.out::println);

        System.out.println("----------------------------------------");

        Student s = students.stream().max(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())))
                .get();
        System.out.println(s);

        Student ss = students.stream().min(((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())))
                .get();
        System.out.println(ss);

        System.out.println("----------------------------------------");

        List<Student> students1 = students.stream().filter(a -> a.getHeight() > 170)
                .collect(Collectors.toList());
        System.out.println(students1);

        System.out.println("----------------------------------------");

        Set<Student> students2 = students.stream().filter(a -> a.getHeight() > 170)
                .collect(Collectors.toSet());
        System.out.println(students2);
        //stream流只能收集一次，不用复用代码，每次得到一个新流

        System.out.println("----------------------------------------");

        Map<String, Double> map =
                students.stream().filter(a -> a.getHeight() > 170)
                        .distinct()
                        .collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(map);

//        Object[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray();
        Student[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));
    }
}
