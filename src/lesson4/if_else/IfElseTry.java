package lesson4.if_else;

import java.util.Scanner;

public class IfElseTry {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Insert");
        int x = sc.nextInt();
        if(x < 10){
            System.out.println("Ваше число меньше 10");
        } else {
            System.out.println("Ваше число больше либо равно 10");
        }

        if(x < 10 || x > 20){
            System.out.println("Ваше число находится вне промежутка от 10 до 20");
        } else {
            System.out.println("Ваше число в диапазоне от 10 до 20");
        }
        System.out.println("Final");


        int y =  14;
        System.out.println(y%2);*/
// Есть цена билета Киев - Днепр 1000
        double cost = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        if (age < 18) {
            if (age == 10){
                System.out.println("Стоимость билета равно " + 0.75 * cost);
            } else {
                System.out.println("Стоимость билета равно " + 0.6 * cost);
            }
        } else if (age > 45){
            System.out.println("Стоимость билета равно " + 0.5 * cost);
        } else {
            System.out.println("Стоимость билета равно " +  cost);
        }

        if(age == 13){
            System.out.println("Age = 13");
        }

    }
}
