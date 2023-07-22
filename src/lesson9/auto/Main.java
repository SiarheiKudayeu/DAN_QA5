package lesson9.auto;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("VW", 10000, false, 12342545);
        Auto auto2 = new Auto("VW", 10000, false, 12345);

        System.out.println(auto1.hashCode());

        System.out.println(auto2.hashCode());

        System.out.println(auto1.equals(auto2));
    }
}
