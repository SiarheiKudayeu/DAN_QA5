package lesson8;

import java.util.Arrays;

public class Peregruz {
    public static void doSmth() {
        System.out.println("Я просто пустой метод");
    }

    public static void doSmth(String text) {
        System.out.println("мне доверили текст: " + text);
    }

    public static void doSmth(int number) {
        System.out.println("Вы ввели число " + number);
    }

    public static void doSmth(int number, String text) {
        System.out.println("Вы ввели число " + number);
        System.out.println("мне доверили текст: " + text);
    }

    public static void doSmth(String text, int number) {
        System.out.println("Вы ввели число " + number);
        System.out.println("мне доверили текст: " + text);
    }

    public static void doSmth(int number1, int number2, int number3) {
        System.out.println("Произведение трех введенных чисел равно " +
                (number1 * number2 * number3));
    }

    public static void doSmth(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        doSmth();
        System.out.println("===============");
        doSmth("Text for method");
        System.out.println("===============");
        doSmth(6);
        System.out.println("===============");
        doSmth(34, "String");
        System.out.println("===============");
        doSmth("Text", 123);
        System.out.println("===============");
        doSmth(1, 3, 5);
        System.out.println("===============");
        doSmth(new int[]{12, 3, 34, 3424, 55});
    }
}
