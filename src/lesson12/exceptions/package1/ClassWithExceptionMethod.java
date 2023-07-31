package lesson12.exceptions.package1;

import java.util.Scanner;

public class ClassWithExceptionMethod {

    public void insertName() throws SiarheiNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name");
        String name = scanner.nextLine();
        if (name.equals("Siarhei") || name.equals("Sergey")) {
            throw new SiarheiNameException();
        }
        System.out.println("Вы ввели имя " + name);
    }

    public static void main(String[] args) {
        ClassWithExceptionMethod ex = new ClassWithExceptionMethod();
        try {
            ex.insertName();
        } catch (SiarheiNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
