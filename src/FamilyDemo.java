public class FamilyDemo {
    public static void main(String[] args){
        FamilyPerson father = new FamilyPerson();
        FamilyPerson sonone = new FamilyPerson();
        FamilyPerson sontwo = new FamilyPerson();

        father.setSurname("A");
        sonone.setSurname("B");
        sontwo.setSurname("C");

        father.setName("11");
        sonone.setName("22");
        sontwo.setName("33");

        System.out.println(father.toString());
        System.out.println(sonone.toString());
        System.out.println(sontwo.toString());

        String surname="ABCD";
        father.setSurname(surname);
        sonone.setSurname(surname);
        sontwo.setSurname(surname);

        System.out.println(father.toString());
        System.out.println(sonone.toString());
        System.out.println(sontwo.toString());

    }
}

class FamilyPerson {
    private String surname;
    private String name;

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return surname+name;
    }
}

