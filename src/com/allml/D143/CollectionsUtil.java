package com.allml.D143;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        /*1、addAll为集合批量添加数据
            public static <T> boolean addAll(Collection<? super T> c, T... elements) {
         */
        List<String> names = new ArrayList<>();
        /*
        这样添加很麻烦
         */
//        names.add("sss");
//        names.add("ssss");
//        names.add("sssss");

        Collections.addAll(names,"xx","ssx","sdacx","dfagc");
        System.out.println(names);

        /*2、打乱List集合中元素的位置(set集合无序，根本没必要打乱)【拿来洗牌？？？】
            public static void shuffle(List<?> list) {
         */
        Collections.shuffle(names);
        System.out.println(names);

        /*3、对List集合进行排序 （升序），只支持list，
            public static <T extends Comparable<? super T>> void sort(List<T> list) {

         */
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,5,3,2,6,87);
        Collections.sort(list);
        System.out.println(list);

        //对学生对象排序,要先实现comparable接口
        List<Student> students = new ArrayList<>();
        students.add(new Student("van", 27, 188.8));
        students.add(new Student("bili", 28, 187.8));
        students.add(new Student("li tiansuo", 24, 177.8));
        students.add(new Student("chunping", 25, 176.8));
        Collections.sort(students);
        System.out.println(students);

        //不让类实现comparable也行,在sort后面加比较器就行，这里是按身高排序，就近选择排序方法
        Collections.sort(students, ((o1, o2)->Double.compare(o1.getHeight(),o2.getHeight())));
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getAge(),o2.getAge());
//            }
//        });

        System.out.println(students);
    }
}
