package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите экшн");
        String action = scanner.nextLine();
        System.out.println("Введите count");
        int count = scanner.nextInt();
        Animal piva = new Animal();
        Animal barsik = new Animal();
        System.out.println(barsik.name);
        barsik.name = "Barsik";
        barsik.age = 4;
        barsik.species = "cat";
        System.out.println("Имя животного " + barsik.name);
        System.out.println("Вид животного " + barsik.species);
        System.out.println("Возраст барсика " + barsik.age);
        System.out.println(barsik);
        System.out.println("==============================");
        barsik.getInfo();
        System.out.println("==============================");
        piva.getInfo();
        System.out.println("==============================");
        String method = barsik.nameOfBarsik();
        System.out.println(method);
        System.out.println("==============================");
        barsik.someAction("сальто", 5);
        System.out.println("==============================");
        barsik.someAction(action, count);
        System.out.println("==============================");
        int restOfLife = barsik.howMuchCanILiveMore(15);
        System.out.println("Барсику осталось " + restOfLife + " лет.");
    }
}
