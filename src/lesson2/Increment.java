package lesson2;

public class Increment {
    public static void main(String[] args) {
        // Постфиксный декремент
        int a = 5;
        System.out.println(a--);
        //a = a - 1;
        System.out.println(a);

        System.out.println("=========================");

        // Префиксный декремент
        int a1 = 5;
        //a = a - 1;
        System.out.println(--a1);
        System.out.println(a1);

        System.out.println();

        // Постфиксный инкремент
        int a2 = 5;
        System.out.println(a2++);
        //a = a - 1;
        System.out.println(a2);

        System.out.println("=========================");

        // Префиксный инкремент
        int a3 = 5;
        //a = a + 1;
        System.out.println(++a3);
        System.out.println(a3);

        int var = 8;
        var += 5; // var = var + 5;
        System.out.println(var);

        /*1)
        int x = 8;
        int y = 5;

        x = 8;
        y+=3;
        int z = --x + --y;

         */
    }
}
