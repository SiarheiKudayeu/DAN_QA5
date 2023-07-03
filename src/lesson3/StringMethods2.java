package lesson3;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        //valueOf()
        boolean boo = false;
        int number = 13;
        String booString = String.valueOf(boo);
        System.out.println(booString);

        String numberString = "13";
        int result = Integer.parseInt(numberString);
        System.out.println(13 == result);
        System.out.println(boo);

        //символы экранирования
        // text name is "Name of text"
        String text = "text name is\n \b'Name of text'";
        System.out.println(text);

        //System.out.println вывод следующего текста с новой строки
        //System.out.printl  вывод следующего текста с той же строки
        System.out.println("первая строка ");
        System.out.print("не первая строка");
        System.out.println("первая строка ");
        System.out.println(" y");

        //length - возвращает кол-во символов строки
        System.out.println(text.length());
        System.out.println(("text name is 'Name of text'").length());

        /*
        * 2) Создать переменную text типа String и разместить в нее произвольный текст.
        Пусть в консоль выводится true, если количество символов в данном тексте превышает 100,
        В противном случае пусть выводится false.*/
        String text2 = "aljscbjlkkkkkkkkkkkkkkkkkk;lashcciugvwievoiwuevh;a";
        int lengthOfString = text2.length();
        System.out.println(lengthOfString);
        boolean result3 = lengthOfString > 100;
        System.out.println(result3);
        System.out.println("===========================");
        //charAt - возвращает символ по индексу
        System.out.println(text2.charAt(0));

        //isEmpty - возвращает true если строка пустая
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        //contains возвращает true если в строке будет присутствовать переданный символ
        // , либо совокупность символов

        String containsText = "contains возвращает ботинок true если в строке ботинок присутствовать переданный символ";
        System.out.println(containsText.contains("*"));
        System.out.println(containsText.contains("ботинок"));
        System.out.println("====================");
        //endsWith(), startsWith()
        System.out.println(containsText.startsWith("contains возвращает ботинок"));
        System.out.println(containsText.endsWith("contains возвращает ботинок"));

        //indexOf() lastIndexOf()
        String example = "qwertyre";
        System.out.println(example.indexOf("e"));
        System.out.println(example.lastIndexOf("e"));

        //substring() - вырезает указанный промежуток символов
        System.out.println(containsText.substring(15));
        System.out.println(containsText.substring(15, 25));
        System.out.println(containsText.substring(0, 25));

        //replace
        System.out.println("====================");
        String first = "My first String";
        System.out.println(first.replace("first", "second"));
        System.out.println(first.replace("first", "\b"));

        int a = 15;
        int b = 25;
        boolean c = a == b;


        //equals для пооверки строк на равенство;
        String first1 = "My first String";
        String first2 = "My first String";
        boolean resultX = first1.equals(first2);
        System.out.println(resultX);

        //split разбивает строку по указонному символу, либо по нескольким символам
        String textForSplit = "split разбивает строку по Указонному символу, либо по нескольким символам";
        System.out.println(textForSplit.split("\\s")[5]);
        System.out.println(textForSplit.split("\\s").length);
        System.out.println("==================");
        System.out.println(textForSplit.split("м")[3]);
        System.out.println(textForSplit.split("м").length);

        String[] arrayOfWords = textForSplit.split("\\s");
        System.out.println(Arrays.toString(arrayOfWords));


        System.out.println(textForSplit.toUpperCase());
        System.out.println(textForSplit.toLowerCase());





    }
}
