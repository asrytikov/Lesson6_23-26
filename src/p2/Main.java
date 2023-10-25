package p2;

public class Main {

    public static void main(String[] args) {
        System.out.println(Oper.sum(10, 20));
        System.out.println(Oper.razn(20, 10));
    }
}

class Oper{
    static int sum(int x, int y){
        return x+y;
    }
    static int razn(int x, int y){
        return x-y;
    }
}
