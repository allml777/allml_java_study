package com.allml.D162;

import java.io.*;

public class BufferFileTest {
    public static void main(String[] args) throws FileNotFoundException {
//        try (InputStream bis = new BufferedInputStream(new FileInputStream("src/com/allml/D162/aaahhh.txt"));
//             OutputStream bos = new BufferedOutputStream(new FileOutputStream("src/com/allml/D162/hua.txt"));) {
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = bis.read(buffer)) != -1) {
//                bos.write(buffer, 0, len);
//            }
//            System.out.println("success");
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        try (BufferedReader bis = new BufferedReader(new FileReader("src/com/allml/D162/aaahhh.txt"))) {
            String line;
            while ((line = bis.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter ris = new BufferedWriter(new FileWriter("src/com/allml/D162/asdgsggaahhdsgsh.txt",true))){
            ris.newLine();
            ris.write("dsfagaah");
        }catch (Exception e){

        }

    }
}
