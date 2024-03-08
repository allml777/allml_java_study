package com.allml.D161;


import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (Reader fr = new FileReader("src/com/allml/D152/ab.txt");) {
            //每次读取一个字符
//            int c;
//            while ((c = fr.read()) != -1) {
//                System.out.print((char)c);
//            }

            int len;
            char[] buffer = new char[3];
            while ((len = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Writer fw = new FileWriter("src/com/allml/D161/aaa.txt");) {
            fw.write("a");
            fw.write(97);
            fw.write("啊");
            fw.write("agjdfgagfuadhgfalg", 0, 4);

            char[] buffer = {'s','v','a','y'};

            fw.write(buffer,0,2);
            //刷新后流可以继续使用，刷新是把流里的内容写到文件里
            //fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
