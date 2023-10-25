package dz5;/*
ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
Можно получить таким образом -
если пользователь вводит 1, то это сложение, 2 - разность и т.д.
Вывести результат действия. Используйте конструкции if -else, case.
* */

import p1.People;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        People people = new People();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите число-действие: ");
        int d = scanner.nextInt();
        scanner.close();

        switch (d) {
            case 1:
                sum(a, b);
                break;
            case 2:
                System.out.println("Разность: " + razn(a,b));
                break;
            case 3:
                System.out.println("Произведение: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("DEL 0");
                    break;
                }
                System.out.println("Частное: " + ((double) a / b));
                break;
            default:
                System.out.println("ERROR");

        }

        if (d == 1) {
            sum(a, b);
        } else if (d == 2) {
            System.out.println("Разность: " + (a - b));
        }
    }

    public static void sum(int a, int b){
        System.out.println("Сумма: " + (a + b));
    }

    public static int razn(int a, int b){
        return a-b;
    }


}