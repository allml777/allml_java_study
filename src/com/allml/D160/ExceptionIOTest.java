package com.allml.D160;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionIOTest {
    public static void main(String[] args) {
        System.out.println(ammm(5, 6));
    }


    //不要在finally里return，会影响返回值的
    public static int ammm(int x, int y) {
        try {
            return x / y;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            return 111111;
        }
    }

}
