package lesson6.homework.array;

import java.util.Scanner;

public class Task1 {
    /*  1)Создать бесконечный цикл, который будет спрашивать ввести у пользователя
        с клавиатуры число, и суммировать все введенные пользователем числа до тех пор,
        пока он не введет с клавиатуры слово FINAL.
        Конечную сумму программа должна вывести в консоль после завершения цикла.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (true) {
            String number = in.nextLine();
            if (number.equals("FINAL")) {
                break;
            }
            result = result + Integer.parseInt(number);
        }
        System.out.println(result);
    }
}
