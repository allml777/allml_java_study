package practice20230525;

public class TESTMULTI {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.setName("th_A");
        t2.setName("th_B");

        t1.start();
        t2.start();
    }
}
