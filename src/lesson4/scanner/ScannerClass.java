package lesson4.scanner;



import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);/*
        System.out.println("Insert any number:");
        int x = input.nextInt();
        System.out.println(x);*/

        System.out.println("Insert any text:");
        String text = input.next();
        System.out.println(text);
        System.out.println(input.next());
        String finalText = input.nextLine();
        System.out.println(finalText.trim());


        //double y = input.nextDouble();


    }

}
