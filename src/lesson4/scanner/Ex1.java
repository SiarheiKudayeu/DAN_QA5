package lesson4.scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        /*        //1) Пользователь вводит с клавиатуры число, в консоль выводится следующий текст:
        //Ваше введенное число в квадрате равно - {число в квадрате}.
*/
        Scanner myFavScanner = new Scanner(System.in);
        System.out.println("Please, insert number");
        int number = myFavScanner.nextInt();
        System.out.println("Ваше введенное число в квадрате равно - " + number * number);

    }
}
