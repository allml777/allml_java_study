public class Puppy {
    int puppyAge;
    String name;
    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }
    public Puppy(String name){
        this.name=name;
        System.out.println("小狗的名字是"+name);
    }

    public static void main(String[] args){
        Puppy a = new Puppy("乐乐");
        a.setAge(5);
        a.getAge();
        System.out.println("小狗的名字是"+a.name);
        System.out.println("小狗的年龄是"+a.puppyAge);
    }
}

