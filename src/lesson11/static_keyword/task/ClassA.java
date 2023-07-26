package lesson11.static_keyword.task;

public class ClassA {
    public ClassA(){
        System.out.println("Конструктор класса А");
    }

    {
        System.out.println("Динамический блок класса А");
    }

    static {
        System.out.println("Статический блок класса А");
    }
}
