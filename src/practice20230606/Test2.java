package practice20230606;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 200 ; i++) {
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }

        }
    }
}
