package lesson6.homework.foreach;

import java.util.Random;

public class ForEachEx2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        //not working
/*        for (int number: array) {
            number = random.nextInt(-10, 10);
        }*/

        for (int number: array) {
            System.out.print(number + " ");
        }


    }
}
