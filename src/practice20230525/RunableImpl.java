package practice20230525;

class RunnableImpl implements Runnable{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("RunnableImpl---->"+i);
            if(i==50){
                try {
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
