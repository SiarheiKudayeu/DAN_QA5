package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaseTry {
    public static void main(String[] args) {
        // Dev, QA, DevOps
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу профессию");
        String profession = sc.nextLine();

        switch (profession.toUpperCase().trim()) {
            case ("QA"):
            case ("AQA"):
                System.out.println("Привет тестировщик");
                System.out.println("Тестируешь ли ты мобилки?");
                String mobile = sc.nextLine();
                switch (mobile){
                    case ("да"):
                        System.out.println("ты тестируешь мобилки");
                        break;
                    case ("нет"):
                        System.out.println("ты не тестируешь мобилки");
                        break;
                }
                break;
            case ("DEV"):
                System.out.println("Привет разработчик");
                break;
            case ("DEVOPS"):
                System.out.println("Привет девопсина");
                break;
            default:
                System.out.println("Нет такой профессии");
        }
    }
}
