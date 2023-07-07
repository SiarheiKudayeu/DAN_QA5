package lesson5;

import java.util.Scanner;

public class Ex1 {
    /*Пользователь вводит с клавиатуры строку, на консоль выводится
    информация из скольки слов состоит данная строка,
    и какое количество символов находится в данной строке.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert text:");
        String text = in.nextLine();
        System.out.println("Number of words equals " + text.split("\\s").length);
        System.out.println("Number of chars equals " + text.replace(" ","").length());
    }
}
