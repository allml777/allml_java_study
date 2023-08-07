package practice20230606;

public class Test6 {
    public static void main(String[] args) {
        String n = "14568";
        System.out.println(encrypt(n));
    }

    static int[] encrypt(String ch){
        int[] a = new int[ch.length()];
        int[] b = new int[ch.length()];

//        System.out.println(ch.length());
//        System.out.println(a.length);
//        System.out.println(b.length);
        for (int i = 0; i < a.length; i++) {
//            System.out.println("i:"+i);
            a[i] = Integer.parseInt(ch.substring(i,i+1));
//            System.out.println("a[i]:"+a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i]+5)%10;
        }

        for (int i = 0; i < b.length; i++) {
//            System.out.println("ib:"+i);
            b[i] = a[b.length-1-i];
//            System.out.println("b[i]:"+b[i]);
        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.printf(b[i]+"\t");
//        }

        return b;
    }

    static int[] decrypt(String ch){
        int[] a = new int[ch.length()];
        int[] b = new int[ch.length()];

        for (int i = 0; i < a.length; i++) {
//            System.out.println("i:"+i);
            a[i] = Integer.parseInt(ch.substring(i,i+1));
//            System.out.println("a[i]:"+a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i]+5)%10;
        }

        return b;
    }
}
