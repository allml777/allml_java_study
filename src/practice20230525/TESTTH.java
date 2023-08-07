package practice20230525;

class TESTTH {
    public static void main(String[] args) {
        RunnableImpl ri = new RunnableImpl()    ;
        Thread t = new Thread(ri);
        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t.getPriority());
        t.start();
    }
}
