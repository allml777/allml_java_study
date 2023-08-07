package practice20230525;

public class Service {
    public void fun1(){
        synchronized (this){
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("fun1");
        }
    }

    public void fun2(){
        synchronized (this){
            System.out.println("fun2");
        }
    }
}
