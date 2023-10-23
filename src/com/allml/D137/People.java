package com.allml.D137;

public class People {
    public static void main(String[] args) {
        person.heart p = new person().new heart();
        p.show();
    }
}
class person{
    private int heartbeat = 150;
    public class heart{
        private int heartbeat = 110;
        void show(){
            int heartbeat = 87;
            System.out.println(heartbeat);
            System.out.println(heart.this.heartbeat);
            System.out.println(person.this.heartbeat);
        }
    }
}
