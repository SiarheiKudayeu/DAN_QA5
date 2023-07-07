package lesson5.arrys;

import java.util.Arrays;

public class ArraysTry {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt.length);

        //1)вручную
        arrayInt[0] = 3;
        arrayInt[3] = 7;
        arrayInt[1] = 345;
        System.out.println(Arrays.toString(arrayInt));

        //2) явная инициализация
        int[] arrayInt2 = {2, 4, 123, 43, 45, 131, 123};
        System.out.println(Arrays.toString(arrayInt2));
        System.out.println(arrayInt2.length);

        //3) цикл for
        int[] arrayInt3 = new int[11];
        for (int i = 0; i < 11; i++) {
            arrayInt3[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayInt3));

        int[] arrayInt4 = new int[3];
        for (int i = 0; i < arrayInt4.length; i++) {
            arrayInt4[i] = i ;
        }
        System.out.println(Arrays.toString(arrayInt4));

        //
        String[] arraysString = new String[3];
        arraysString[0] = "one";
        arraysString[1] = "two";
        arraysString[2] = "three";
        System.out.println(Arrays.toString(arraysString));



    }
}
