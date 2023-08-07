public class Fight {
    public static void main(String[] args){
        Tank a = new Tank();
        Tank b = new Tank();

        a.speedUp(120);
        b.speedUp(150);

        a.setBulletAmount(20);
        b.setBulletAmount(20);

        a.setColor('a');
        b.setColor('b');


    }
}
