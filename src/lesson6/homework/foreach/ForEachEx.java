package lesson6.homework.foreach;

import java.util.Random;

public class ForEachEx {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = random.nextInt(-10, 10);
        }

        for(int number: array){
            System.out.print(number + " ");
        }


    }
}
