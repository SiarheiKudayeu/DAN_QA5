package lesson5;

import java.util.Scanner;

public class Tak5 {
    /*    Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два
        числа и символ - или + или % или / или *. На экран выводится резултат действия над двумя введенными числами.
        Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1:");
        double number1 = scanner.nextDouble();

        System.out.println("Insert number2:");
        double number2 = scanner.nextDouble();

        System.out.println("Insert your action:");
        String action = scanner.next();

        double result = action.equals("+") ? number1 + number2 :
                action.equals("-") ? number1 - number2 :
                        action.equals("/") ? number1 / number2 :
                                action.equals("*") ? number1 * number2 :
                                        action.equals("%") ? number1 % number2 : 0;
        System.out.println(result);

    }
}
