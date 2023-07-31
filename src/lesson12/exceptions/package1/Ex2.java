package lesson12.exceptions.package1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {12, 242, 4, 0, 56, 34};
        System.out.println("Insert index");
        try {
            System.out.println(15 / (array[scanner.nextInt()]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Деление на ноль");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Exit");
    }
}
