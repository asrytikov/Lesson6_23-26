package p1;

public class People {

    private String name;
    private int age;
    private int id;

    private static int counter = 1;

    public static void getCounter(){
        System.out.println(counter);
    }

    {
        name = "No data";
        age = 0;
        System.out.println("Create object");
        id = counter++;
    }

    public People(){
        /*name = "Not name";
        age = 18;*/
        this("Not name", 18);
    }

    public People(String n){
        name = n;
        age = 18;
    }

    /*public People(String n, int a){
        name = n;
        age = a;
    }*/

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.printf("ID: %d Name: %s \tAge: %d\n", id, name, age);
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
        if (age >0 && age < 110){
            this.age = age;
        }
    }
}
