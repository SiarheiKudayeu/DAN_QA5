package lesson11.static_keyword.task;

public class ClassD extends ClassC {
    public ClassD(){
        System.out.println("Конструктор класса D");
    }
    {
        System.out.println("Динамический блок класса D");
    }

    static {
        System.out.println("Статический блок класса D");
    }
}
