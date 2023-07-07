package lesson5.while_do;

import java.util.Scanner;

public class DoWhileTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number1:");
        double number1 = scanner.nextDouble();
        System.out.println("Insert number2:");
        double number2 = scanner.nextDouble();

        while (number1 > 0){
            System.out.println(number1);
            number1--;
        }
        System.out.println("==============");
        do{
            System.out.println(number2);
            number2--;
        } while (number2 > 0);
    }
}
