package lesson10.recurs;

import java.util.Scanner;

public class Recurs {
    //Пользователь вводит положительное число с клавиатуры,
    // а система выводит в консоль все числа от введенного,
    //до 0. При решении данной задачи попробовать использовать рекурсию

/*    public static void recursSout(){
        System.out.println("Я рекурсия");
        recursSout();
    }

    public static void main(String[] args) {
        recursSout();
    }*/
    public static void insertFromConsoleAndPrint(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для рекурсии:");
        printAllNumbers(scanner.nextInt());
    }

    public static void printAllNumbers(int number){
        if(number == 0){
            System.out.println(number);
        }else if(number < 0){
            System.out.println("Вы ввели отрицательное число");
        }else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }
    }

    public static void main(String[] args) {
        insertFromConsoleAndPrint();
    }

}
