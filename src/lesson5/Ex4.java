package lesson5;

import java.util.Scanner;

public class Ex4 {
    //Есть соцсеть с галереей фото.
    //спрашивается кол-во фото для загрузки
    //ограничении 100 фото
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfFoto = 0;
        while (countOfFoto <= 100) {
            if(countOfFoto == 100){
                break;
            }
            System.out.println("Какое кол-во фото хотите загрузить?");
            int tempCount = in.nextInt();
            if (countOfFoto + tempCount > 100){
                System.out.println("Размер галереи превышен");
                System.out.println("Осталось места на " + (100 - countOfFoto));
                continue;
            }
                countOfFoto = countOfFoto + tempCount;
            System.out.println("Осталось места на " + (100 - countOfFoto));
        }

    }
}
