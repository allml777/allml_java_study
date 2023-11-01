package com.allml.D140;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(666);
        set.add(555);
        set.add(777);
        set.add(452);
        set.add(666);
        System.out.println(set);

    }
}
