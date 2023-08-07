import java.util.Arrays;
import java.util.Collections;


public class Array_2 {
    public static void main(String[] args){
        Array_2 a = new Array_2();
        a.hebing();
    }

    void hebing(){
        Integer a[] = {1,7,9,11,13,15,17,19};
        Integer b[] = {2,4,6,8,10};
        Integer c[] = new Integer[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for (int x : c) {
            System.out.print(x + "\t");
        }

        Arrays.sort(c,Collections.reverseOrder());
        for (int x : c) {
            System.out.print(x + "\t");
        }
    }
}
