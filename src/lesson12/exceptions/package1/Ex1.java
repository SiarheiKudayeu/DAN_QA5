package lesson12.exceptions.package1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
//      ArithmeticException
/*        int x = 12;
        int y = 0;
        System.out.println(x/y);
        System.out.println("Программа завершена");*/


        //ArrayIndexOutOfBoundsException
/*        int[] array = new int[5];
        System.out.println(array[100]);
        System.out.println("Программа завершена");*/


        //NullPointerException
/*        Person person = null;
        person.getName();
        System.out.println("Программа завершена");*/

        Scanner scanner = new Scanner(System.in);
        int[] array = {1,3,34,357,6,2};
        System.out.println("Insert array index:");
        try{
            System.out.println(array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("неуместный индекс массива");
            System.out.println(exception.getLocalizedMessage());
        } finally {
            System.out.println("Блок finally");
        }
        System.out.println("А мы продолжаем");
    }
}
