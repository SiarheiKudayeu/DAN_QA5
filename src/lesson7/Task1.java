package lesson7;

import java.util.Scanner;

public class Task1 {
    /*    Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
        Для вывода использовать условные операторы, циклы.
        Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
        Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
        а программа выводит сам треугольник.
        Пример с числом 7:
                *******
                ******
                *****
                ****
                ***
                **
                *

                *******
                *    *
                *   *
                *  *
                * *
                **
                *
        Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert length of triangle");
        int length = scanner.nextInt();

        //Filled Triangle
        for (int i = length; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Empty Triangle
        for (int i = length; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                if (a == 0 || a == (i - 1) || i == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
