package p3;

public class Main {

    public static void main(String[] args) {
        People p = new People("Alex");
        System.out.println(p.getName());
        //changeName(p);
        changePeople(p);
        System.out.println(p.getName());
    }

    static void changeName(People people){
        people.setName("Pavel");
    }

    static void changePeople(People people){
        people = new People("Misha");
        people.setName("Stas");
    }

}

class People{

    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
