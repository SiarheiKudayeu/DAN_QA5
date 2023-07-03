package lesson3;

public class StringMethods {
    public static void main(String[] args) {
        int x = 12;

        String word = new String("Какой-то текст");
        System.out.println(word);
        String word2 = "Some text";
        System.out.println(word2);

        System.out.println(word2.concat(". And new text"));
        word2 = word2.concat(". And new text");
        System.out.println(word2.concat(" ").concat(String.valueOf(x)));

        //+ equals concat
        System.out.println(word2 + " " + word + " new text " + x);
        String result = word2 + " " + word + " new text " + x;
        System.out.println(result);

        /*
        * 1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
     Создать также переменную типа String result1 и result2.
     Поместить в result1 все слова word1 - word5 используя метод concat.
     Поместить в result2 все слова word1 - word5 используя оператор +.
     * Вывести result1 и result2 в консоль*/

        String word1 = "next1";
        String word_2 = "next2";
        String word3 = "next3";
        String word4 = "next4";
        String word5 = "next5";

        String result1 = word1.concat(" ")
                .concat(word_2).concat(" ")
                .concat(word3).concat(" ")
                .concat(word4).concat(" ")
                .concat(word5);

        System.out.println(result1);

        String result2 = word1 + " " + word_2 + " " + word3 + " " + word4 + " " + word5;
        System.out.println(result2);
    }
}
