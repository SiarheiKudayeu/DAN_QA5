package lesson4.if_else;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
          /*Пользователь вводит с клавиатуры число. Если оно четное и меньше 15, то в консоль выводится сообщение:
        Число четное и меньше 15.
        В противном случае выводится сообщение:
        Число нечетное.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert");
        int x = sc.nextInt();
        if (x % 2 == 0 && x < 15){
            System.out.println("Число четное и меньше 15.");
        } else {
            System.out.println("Число нечетное.");
        }
    }
}
