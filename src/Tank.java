public class Tank {
    double speed = 0;
    int bulletAmount;
    char color;

    void speedUp(int x){
        if(x>0){
            if(x>=this.speed){
                if(x>200){
                    this.speed = 200;
                    System.out.println("the max speed is 200km/h");
                }else{
                    this.speed = x;
                }
            }else {
                System.out.println("please use speedDown");
            }
        }else {
            System.out.println("please input right number!!!");
        }
    }

    void speedDown(int x){
        if(x>0){
            if(x<=this.speed){
                this.speed = x;
            }else {
                System.out.println("please use speedUp");
            }
        }else {
            System.out.println("please input right number!!!");
        }
    }

    void setBulletAmount(int x){
        this.bulletAmount = x;
    }

    double getSpeed(){
        return speed;
    }

    int getBulletAmount(){
        return bulletAmount;
    }

    void fire(){
        bulletAmount--;
    }

    void conFire(int x){
        bulletAmount -= x;
    }

    void setColor(char x){
        this.color = x;
    }

    void brake(){
        this.speed = 0;
    }
}
