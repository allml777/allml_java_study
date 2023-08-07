package practice20230525;


class FirstThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("firstthread---->"+i);
        }
    }
}
