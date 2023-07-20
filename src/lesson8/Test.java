package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Test {
   /*4) Создать метод который принимает в параметры значение типа int, после создает массив
Заполненный случайными числами от 1 до 100 размеренностью, равной введенному в параметру int.
Данный метод выводит в консоль все значения данного массива и  возвращает минимальное значение данного массива.*/

    public int arrayMin(int znacheniya) {
        int[] array1 = new int[znacheniya];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(array1));

        int minimum = array1[0];
        for(int i = 0; i < array1.length; i++){
            if(array1[i] < minimum){
                minimum = array1[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Minimum of array is "+ test.arrayMin(10));
    }
}
