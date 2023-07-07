package lesson5;

import java.util.Date;
import java.util.Scanner;

public class Ex2 {
    /*
     Пользователь вводит с клавиатуры свой год рождения.
     На консол выводится информация о его возрасте.
      Используем класс Date как на занятии.
              (P.s пока не затрагиваем момент месяца рождения,
      останавливаемся только на разнице лет. Если вам
      вдруг понадобится преобразовать тип String в int,
      то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your year of birth:");
        int yearOfBirth = in.nextInt();
        Date date = new Date();
        int currentYear = Integer.parseInt(String.format("%tY", date));
        System.out.println("Your age " + (currentYear - yearOfBirth));
    }
}
