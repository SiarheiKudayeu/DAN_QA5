package lesson6.homework;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        String number = scanner.nextLine();
        String result = "";
        for ( int i = number.length()-1; i >=0; i--){
            result = result + number.charAt(i);
        }
        if(result.equals(number)){
            System.out.println("Palindrom");
        } else {
            System.out.println("Non palindrome");
        }
    }
}
