package practice20230525;

public class TESTSER {
    public static void main(String[] args) {
        Service service = new Service();
        Service service1 = new Service();
        Thread t1 = new Thread(new MyThread1(service));
        Thread t2 = new Thread(new MyThread2(service1));

        t1.start();
        t2.start();
    }
}
