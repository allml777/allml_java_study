package com.allml.D151.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static List<Criminal> criminals = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();

        for (int i1 = 1; i1 < 100; i1++) {
            while (true) {
                int i = random.nextInt(200) + 1;
                if (isRepeat(i)) {
                    Criminal criminal = new Criminal(i, i1);
                    criminals.add(criminal);
                    break;
                }
            }
        }
        System.out.println("囚犯占位：" + criminals);

        while (criminals.size() > 1) {
            List<Criminal> tempCriminals = new ArrayList<>();
            for (int i = 1; i < criminals.size(); i+=2) {
                Criminal killed = criminals.get(i);
                tempCriminals.add(killed);
            }
            criminals = tempCriminals;
        }
        Criminal luckDog = criminals.get(0);
        System.out.println(luckDog);
    }

    public static boolean isRepeat(int num) {
        for (Criminal c : criminals) {
            if (c.getLocation() == num) {
                return false;
            }
        }
        return true;
    }
}
