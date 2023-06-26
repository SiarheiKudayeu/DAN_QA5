package lesson2;

public class BoleanClass {
    public static void main(String[] args) {
        /*boolean myBoolean = false;
        boolean myBoolean2 = true;
        System.out.println(myBoolean2);
        System.out.println(myBoolean);*/

        //==
 /*       int x = 13;
        int y = 14;
        boolean result = (x == y);
        System.out.println(result);*/

        //!=
/*        int x = 13;
        int y = 14;
        boolean  result = (x != y);
        System.out.println(result);*/

        // > < >= <=
        int x = 13;
        int y = 13;
        boolean result = (x >= y);
        System.out.println(result);

        System.out.println("=========");
        System.out.println(true != false);
        System.out.println(true == false);
        System.out.println(false == false);
        System.out.println(false != true);
        System.out.println(!false);
        System.out.println(!true);

        System.out.println("=========");
        //   || или
        System.out.println(true || false || false);
        System.out.println((2 > 4) || (2 < 15) || (2 == 5));

        //   && и
        System.out.println("=========");
        System.out.println(true && true && false);
        int r = 19;
        boolean e = (r > 18 && r % 2 == 0);
        System.out.println(e);
        System.out.println("============");

        int number = 4;
        int zero = 0;
        System.out.println("Является ли число четным?");
        System.out.println(number%2 == zero);


    }

}
