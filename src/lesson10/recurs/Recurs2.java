package lesson10.recurs;

import java.util.Scanner;

public class Recurs2 {
    //Пользователь вводит с клавиатуры сумму, которую он хочет взять в кредит, а также сумму
    //которую он будет выплачивать каждый месяц. В консоль выводится порядковый номер месяца,
    // и сумма оставшаяся для выплаты кредита. Как только кредит погашен, в консоль выводится
    //фраза: Кредит погашен за {кол-во месяцев}.

    public static void takeMoneyFromBank() {
        Scanner sd = new Scanner(System.in);
        System.out.println("Insert summ for credit");
        int summ = sd.nextInt();
        System.out.println("Monthly summ");
        int digi = sd.nextInt();
        bank(summ, digi, 1);
    }

    public static void bank(int money, int dolg, int month) {
        money = money - dolg;
        System.out.println("порядковый номер месяца " + month + " сумма оставшаяся для выплаты кредита " + money);
        if (money <= 0) {
            System.out.println("Кредит погашен за " + month);
        } else {
            month++;
            bank(money, dolg, month);
        }
    }

    public static void main(String[] args) {
        takeMoneyFromBank();
    }
}

