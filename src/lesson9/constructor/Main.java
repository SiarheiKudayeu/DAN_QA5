package lesson9.constructor;

public class Main {
    public static void main(String[] args) {
        Home home1 = new Home("Ул. Рабочая", 10, 2, false);
        home1.getInfo();
        Home home2 = new Home();
        Home home3 = new Home(3, 15);
        System.out.println("===================");
        home3.getInfo();
        System.out.println("===================");
        System.out.println(home3);
    }
}
