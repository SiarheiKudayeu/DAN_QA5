package lesson6.homework.array;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
/*      Заполнить массив на 20 элементов случайными числами от 0 до 100.
        Вывести в консоль все значения данного массива.
        Найти минимальный элемент и вывести его на консоль.*/

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        int max = array[0];
        for (int n: array){
            if(n > max){
                max = n;
            }
        }

        for (int num: array){
            System.out.print(num + " ");
        }
        System.out.println("\nMinimum " + min);
        System.out.println("Maximum " + max);

    }
}
