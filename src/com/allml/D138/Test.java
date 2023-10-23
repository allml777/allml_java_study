package com.allml.D138;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("zzj");
        lists.add("zzb");
        lists.add("zzb");
        lists.add("nfr");
        System.out.println(lists);

        lists.add(2,"zxxz");
        System.out.println(lists);

        System.out.println(lists.remove(2));
        System.out.println(lists);

        System.out.println(lists.get(3));

        lists.set(3,"牛魔王");
        System.out.println(lists);

        //Linkedlist 双向链表
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("111");
        queue.addLast("222");
        queue.addLast("333");
        queue.addLast("444");
        queue.addLast("555");
        System.out.println(queue);
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //用Linkedlist设计栈
        System.out.println("-------------------");

        LinkedList<String> stack = new LinkedList<>();
        //压栈 用push api也行 出栈也可以用pop
        stack.addFirst("11");
        stack.addFirst("22");
        stack.addFirst("33");
        stack.addFirst("44");
        System.out.println(stack);
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
