package lesson2;

public class Primitives {
    public static void main(String[] args) {
        // byte -128 till 127
        byte muByte = 6;
        System.out.println(muByte);

        //short -32768 till -32767
        short myShort = 3000;
        System.out.println(myShort);

        //int -2^31 till 2^31 - 1
        int myInt = 10000;
        System.out.println(myInt);

        //long -2^63 till 2^63 - 1
        int myLong = 1000000000;
        System.out.println(myLong);

        //float
        float myFloat = 6.0F;
        System.out.println(myFloat);

        //double
        double myDouble = 7.0;
        System.out.println(myDouble);

        int x = 39;
        int y = 10;
        double xDouble = 39;
        double yDouble = 10;
        //int result = x - y;
        System.out.println(x - y);
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(xDouble / yDouble);

        //остаток от деления %
        System.out.println(22 % 9);

        //x1 = 2;
        //y1 = 8;
        //z1 = 4;

        //12%5
        // 12/5  2 2/5
        System.out.println(12 % 5);
        System.out.println(2 % 8); //  2/8
        System.out.println("Insert value under 0");
        System.out.println(-12 % 5);
        System.out.println(-12 % -5);
        System.out.println(12 % -5);

    }
}
