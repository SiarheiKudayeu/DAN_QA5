package lesson11.static_keyword.task;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }

    {
        System.out.println("Динамический блок класса C");
    }

    static {
        System.out.println("Статический блок класса C");
    }
}
