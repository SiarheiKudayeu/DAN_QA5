package lesson3.Homework;

public class Task2 {

    /*
                2. Создать строку string = "Testing, is my favourite job"
    Вывести на экран отдельно каждое слово и длину этого слова в след виде:
    Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
    Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
    и т.д.
    Вывести на консоль true, если первое слово длиннее остальных, в
    противном случае вывести false.
    */
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String word1 = string.split("\\s")[0];
        word1 = word1.replace(",", "");
        String word2 = string.split("\\s")[1];
        String word3 = string.split("\\s")[2];
        String word4 = string.split("\\s")[3];
        String word5 = string.split("\\s")[4];
        System.out.println("Cлово1 = " + word1 + ", Длина этого слова = " + word1.length() + ".");
        System.out.println("Cлово2 = " + word2 + ", Длина этого слова = " + word2.length() + ".");
        System.out.println("Cлово3 = " + word3 + ", Длина этого слова = " + word3.length() + ".");
        System.out.println("Cлово4 = " + word4 + ", Длина этого слова = " + word4.length() + ".");
        System.out.println("Cлово5 = " + word5 + ", Длина этого слова = " + word5.length() + ".");

        boolean result = word1.length() > word2.length() &&
                word1.length() > word3.length() &&
                word1.length() > word4.length() &&
                word1.length() > word5.length();
        System.out.println(result);
    }


}


