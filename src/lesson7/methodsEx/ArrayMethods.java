package lesson7.methodsEx;

import java.util.Arrays;

public class ArrayMethods {

    /*           */

/*

    }*/

    static void arraySortMinMax(int[] numbersInt) {
        for (int i = 0; i < numbersInt.length; i++) {
            int min;
            for (int a = i + 1; a < numbersInt.length; a++) {
                if (numbersInt[i] > numbersInt[a]) {
                    min = numbersInt[a];
                    numbersInt[a] = numbersInt[i];
                    numbersInt[i] = min;
                }
            }
        }
    }

    static void maxFromArray(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println(max);
    }

    static void minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] array1 = {12, 234, 2, 34, -7, 8, -766};
        int[] array2 = {0, 3, 345, 344, 0, 8, -54};
        arraySortMinMax(array1);
        System.out.println(Arrays.toString(array1));
        arraySortMinMax(array2);
        System.out.println(Arrays.toString(array2));

        minArray(array1);

        maxFromArray(array2);

    }
}
