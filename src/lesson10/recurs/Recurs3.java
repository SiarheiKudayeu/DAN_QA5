package lesson10.recurs;

import java.util.Scanner;

public class Recurs3 {
    // Используя рекурсию напишите метод, который будет выводить введенное число в обратном порядке,
    // так чтобы каждая цифра писалась два раза, после ставился пробел,
    // и вторая цифра тоже писалась два раза и после ставился пробел...
    // Пример: вы вводите 563
    // вывод будет следующий 33 66 55
    static void recursAndScan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert:");
        recurs(scanner.nextInt());
    }

    static void recurs(int number) {
        System.out.print((number % 10) + "" + (number % 10) + " ");
        if (number / 10 == 0) {
        } else {
            number = number / 10;
            recurs(number);
        }
    }

    public static void main(String[] args) {
      /*  int x = 563;
        System.out.println(x % 10);
        System.out.println((x / 10) % 10);
        System.out.println(((x / 10) / 10) % 10);
        int y = 7;
        System.out.println(y / 10);*/
        recursAndScan();
    }


}
