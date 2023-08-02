package lesson13.exeptions.ex1;

import java.util.Scanner;

public class Example2 {
    /*
     * Создать класс с четырьмя методами.
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "исключение".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */

    public void checkString1(String string) throws NechetLenthException {
        if (string.length() % 2 != 0) {
            throw new NechetLenthException("Количество символов в строке нечетное.");
        }
    }

    public void checkString2(String string) throws ContainsException {
        if (string.contains("исключение")) {
            throw new ContainsException("Строка содержит \"исключение\"");
        }

    }

    public void checkString3(String string) throws CountOfWordException {
        if (string.split("\\s").length < 3) {
            throw new CountOfWordException("Кол-во слов меньше трех");
        }


    }

    public void checkString4(String string) throws CountOfWordException, ContainsException, NechetLenthException {
        checkString1(string);
        checkString2(string);
        checkString3(string);
    }

    public static void main(String[] args) throws NechetLenthException {
        Example2 example2 = new Example2();
/*        try {
            example2.checkString4("asasdasd");
        } catch (ContainsException e){
            System.out.println(e.getMessage());
        } catch (CountOfWordException e){
            System.out.println(e.getMessage());
        } catch (NechetLenthException e){
            System.out.println(e.getMessage());
        }*/
        Scanner scanner = new Scanner(System.in);

        try {
            example2.checkString4(scanner.nextLine());
        } catch (ContainsException | CountOfWordException | NechetLenthException e) {
            System.out.println(e.getMessage());
        }
/*        try {
            example2.checkString4("asasdasd");
        } catch (ContainsException | CountOfWordException  e) {
            System.out.println(e.getMessage());
        }*/
    }
}
