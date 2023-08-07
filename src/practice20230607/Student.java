package practice20230607;

public class Student {
    private int age;
    private String name;

    public Student(int age,String name) {
        setAge(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0&&age<=200){
            this.age = age;
        }else{
            System.out.println("你年龄有问题");
        }
    }
}
