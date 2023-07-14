package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList это класс наследуемый от интерфейса List.
        //Это автоматически расширяемый массив, который может содержать элементы любого типа
        //Но в одном ArrayList могут находится только однотипные элементы
        //Мы не можем указывать примитивыне типы данных при создании ArrayList.
        //только их одноименные классы обертки

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        for (int i = 0; i < 10; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        //
        ArrayList<String> arrayListString = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(arrayListString);
        arrayListString.add("Four");
        System.out.println(arrayListString);

        System.out.println(arrayListString.size());
    }
}
