package lesson4.ternar;

import java.util.Scanner;

public class TernarTry {
    public static void main(String[] args) {
        // условие ? выражение1 : выражение2

        // оператор будет возвращать выражение 1, если условие = true
        // оператор будет возвращать выражение 2, если условие = false
        // тернарный оператор должен пригимать значение.

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        String message = age > 18 ? "Вы совершеннолетний гражданин" : "Вы несовершеннолетний гражданин";
        System.out.println(message);

        System.out.println("новая ли машина?");
        boolean isCarnew = sc.nextBoolean();
        int costAuto = isCarnew ? 10000 : 5000;
        System.out.println("Cost of auto is " + costAuto);*/

        //Есть возможность использовать множественные тернарный оператор:
        //допустим нужно определить входит ли введенное число в интервал от 5 до 100 включительно

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int number = sc.nextInt();
        String positive = "введенное число входит  в интервал от 5 до 100";
        String negative = "введенное число не входит  в интервал от 5 до 100";
        String result = number < 5 ? negative : number > 100 ? negative : positive;
        System.out.println(result);
    }
}
