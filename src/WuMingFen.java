public class WuMingFen {
    String name;
    int quantity;
    boolean isLiquid;

    public WuMingFen(String name,int quantity,boolean isLiquid){
        this.name = name;
        this.quantity = quantity;
        this.isLiquid = isLiquid;
    }

    public WuMingFen(String name,int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public WuMingFen(){
        this.name = "name";
        this.quantity = 2;
        this.isLiquid = true;
    }

    String check(){
        return name+quantity+isLiquid;
    }

    public static void main(String[] args){
        WuMingFen a = new WuMingFen();
        System.out.println(a.check());
    }
}
