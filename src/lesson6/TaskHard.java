package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class TaskHard {
    //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
    //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
    //и вывести на экран.
    //avavadv8advadvad9advadv7advad9v898advadv08adv6
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert String");
        String text = scanner.nextLine();
        String result = "";
/*
        char x = '8';
        System.out.println(Character.isDigit(x));*/

        if (text.split("\\d").length == 1) {
            System.out.println("В данном тексте нет ни одного числа");
        } else {
            System.out.println("В данном тексте eсть числа");
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    result = result + text.charAt(i);
                    while ((i + 1 != text.length()) && Character.isDigit(text.charAt(i + 1))) {
                        i = i + 1;
                        result = result + text.charAt(i);
                    }
                    result = result + " ";
                }
            }

        }
        String[] numbers = result.split("\\s");
        for (String n : numbers) {
            System.out.print(n + " ");
        }

        int[] numbersInt = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbersInt[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("");
        System.out.println(Arrays.toString(numbersInt));

        //Упорядочить по возрастанию
        for (int i = 0; i < numbersInt.length; i++) {
            int min;
            for (int a = i + 1; a < numbersInt.length; a++) {
                if (numbersInt[i] > numbersInt[a]) {
                    min = numbersInt[a];
                    numbersInt[a] = numbersInt[i];
                    numbersInt[i] = min;
                }
            }
        }

        //Проверка нового массива
        System.out.println(Arrays.toString(numbersInt));


    }
}
