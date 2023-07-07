package lesson5.formatter;

import javax.xml.crypto.Data;
import java.util.Date;

public class FormatterTry {
    public static void main(String[] args) {
        //%s - строка
/*        System.out.printf("Number of %s chars equals ", "next");
        System.out.printf("%nNumber of %s chars equals %s", "SPEC1", "SPEC2");
        System.out.printf("%nNumber of %2$s chars equals %1$s", "SPEC1", "SPEC2");
        System.out.printf("%nNumber of %1$s chars equals %1$s", "SPEC1");
        System.out.println("\n=========================");*/

        //%b
/*        System.out.printf("Boolean format equals %b ", null); //false
        System.out.printf("%nBoolean format equals %b ", true); //true
        System.out.printf("%nBoolean format equals %b ", false); //false
        System.out.printf("%nBoolean format equals %b %n", 254);  //true */

        //%c - char,
        //%d = byte, short, int, long
        //%f - float, double

        Date date = new Date();

        //t
        //H - часы, M - минуты, S - секунды, L ... N... T - формат времени
        //p
        System.out.printf("Time now is: %1$tH hours, %1$tM minutes, %1$tS seconds", date);
        System.out.printf("%nTime now is: %tT%n", date);

        //A - day of week, d -two numbers of date, B - month string, m - month number
        //Y - full year, y - two numbers of year

        String dayOfweek = String.format("%tA", date);
        System.out.println(dayOfweek);
        int monthNumber = Integer.parseInt(String.format("%tm", date));
        System.out.println(monthNumber);
    }
}
