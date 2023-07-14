package lesson7;

import java.util.Arrays;
import java.util.Collections;

public class ArrayClass {
    public static void main(String[] args) {
        //sort() - сортировка по возрастанию
        int[] array1 = {12, 234, 2, 34, -7, 8, -766};


        String[] test = {"asd", "dask", "bob", "cqwiqdqdiulg"};
        Arrays.sort(array1);
        Arrays.sort(test);

        //toString() - приводим массив к строковому типу и можем отобразить его содержимое
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(test));


        //Для сортировки по убыванию массива примитивных типов данных прямого метода нет
        //можно воспользоваться методом класса Collections, но для этого нужно создать массив
        //из объектов соответствующего класса обертки
        int[] array2 = {0, 3, 345, 344, 0, 8, -54};
        Integer[] array2Int = new Integer[array2.length];
        for (int i = 0; i < array2.length; i++) {
            array2Int[i] = array2[i];
        }
        Arrays.sort(array2Int, Collections.reverseOrder());
        System.out.println(Arrays.toString(array2Int));

        int[] x = {0, 3, 345, 344, 0, 8, -54};
        int[] y = {0, 3, 345, 344, 0, 8, -54};

        System.out.println(x);
        System.out.println(y);

        System.out.println(x.equals(y));


        //fill() заполняет массив указанным элементом
        String[] strings = new String[6];
        System.out.println(Arrays.toString(strings));
        Arrays.fill(strings, "-");
        System.out.println(Arrays.toString(strings));

        int[] ints = new int[10];
        Arrays.fill(ints, (int) (Math.random() * 100) - 50);
        System.out.println(Arrays.toString(ints));

        //также можно указать диапазон идексов, внутри которых будет назаначение
        //элементам массива какзанного значения.
        int[] ints2 = new int[10];
        Arrays.fill(ints2, 2, 7, 33);
        System.out.println(Arrays.toString(ints2));

        //Заполнить двумерный массив звездочками
        String[][] strings1 = new String[5][5];
        for (int i = 0; i < strings1.length; i++) {
            Arrays.fill(strings1[i], "*");
        }
        System.out.println(Arrays.deepToString(strings1));

        for (String[] text : strings1) {
            System.out.println(Arrays.toString(text));
        }

        //binarySearch() - можно получить индекс элемента по его значению
        String[] arrayBinaryString = {"One", "Two", "Three"};
        System.out.println(Arrays.binarySearch(arrayBinaryString, "Two"));
        System.out.println(Arrays.binarySearch(x, 344));

        //equals() - без Arrays
        int[] x1 = {0, 3, 345, 344, 0, 8, -54};
        int[] y1 = {0, 3, 345, 344, 0, 8, -54};

        System.out.println(x1);
        System.out.println(y1);

        System.out.println(x1.equals(y1));

        //equals() - с Arrays
        String[] arrayBinaryString2 = {"One", "Two", "Three"};
        String[] arrayBinaryString3 = {"One", "Two", "Three"};
        System.out.println(Arrays.equals(x1, y1));
        System.out.println(Arrays.equals(arrayBinaryString2, arrayBinaryString3));
        //deepEquals() с Arrays
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepEquals(numbers2, numbers));

        //copyOf() метод возвращающий новый массив на основе массива переданного в параметры метода
        String[] array = Arrays.copyOf(arrayBinaryString2, arrayBinaryString2.length);
        System.out.println(Arrays.toString(array));

        String[] array3 = Arrays.copyOf(arrayBinaryString2, 1);
        System.out.println(Arrays.toString(array3));

        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов
        int[] arrayParent = {0, 3, 345, 344, 0, 8, -54};
        int[] arrayChild  = new int[20];
        System.arraycopy(arrayParent, 2, arrayChild, 7, 4);
        System.out.println(Arrays.toString(arrayChild));
    }
}
