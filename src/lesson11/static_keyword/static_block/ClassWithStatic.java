package lesson11.static_keyword.static_block;

public class ClassWithStatic {
    static String day;

    static void whatDayIsITToday(){
        System.out.println("Today is " + day);
    }

    static {
        day = "Sunday";
    }

    static {
        day = "Friday";
    }
}
