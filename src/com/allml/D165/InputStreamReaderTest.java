package com.allml.D165;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (
                //文件编码是GBK，程序编码是UTF-8，如果直接打开会乱码
                //先用字节输入流读取文件
                InputStream is = new FileInputStream("src\\com\\allml\\D165\\gbkFile.txt");
                //再用字符输入流按指定的编码方式把字节输入流转换
                Reader fr = new InputStreamReader(is, "GBK");
                //用缓冲字符输入流包住字符输入流获取更好的效率
                BufferedReader bf = new BufferedReader(fr);
                Writer ww = new OutputStreamWriter(new FileOutputStream("src\\com\\allml\\D165\\utfFile.txt"),"GBK");
        ) {
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }

            //虽然文件名是utfFile，但是我写进去的是GBK喵
            ww.write("典孝急乐蚌abcde");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
