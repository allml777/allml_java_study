package practice20230606;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String code = CreateCode(5);
            System.out.println(code);
        }

    }

    public static String CreateCode(int n){
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    char ch = (char) (r.nextInt(26)+65) ;
                    code += ch;
                    break;
                case 1:
                    char CH = (char) (r.nextInt(26)+97);
                    code += CH;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
