package lesson6.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner polindromNumber = new Scanner(System.in);
        System.out.println("enter number");
        String number = polindromNumber.nextLine();
        boolean polindrom = true;
        char[] number1 = number.toCharArray();
        for (int i = 0; i <= number1.length / 2 - 1; i++) {
            if (number1[i] != number1[number1.length - i - 1])
                polindrom = false;
        }
        if (polindrom)
            System.out.println("polindrom");
        else
            System.out.println("ne polindrom");
    }
}
