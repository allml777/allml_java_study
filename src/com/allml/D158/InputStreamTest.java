package com.allml.D158;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("src/com/allml/D152/ab.txt");

//        byte[] buffer = new byte[3];
//        int len;
//
//        while ((len = is.read(buffer))!=-1){
//            String rs = new String(buffer,0,len);
//            System.out.print(rs);
//        }
//        is.close();

        byte[] buffer = is.readAllBytes();

        String ss = new String(buffer);
        System.out.println(ss);
        System.out.println(ss.length());

    }
}
