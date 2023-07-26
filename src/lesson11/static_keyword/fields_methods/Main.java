package lesson11.static_keyword.fields_methods;

public class Main {
    public static void main(String[] args) {
        ExStatic.staticMethod();
        System.out.println(ExStatic.staticString);
        System.out.println("==============");
        ExStatic exStatic = new ExStatic();
        exStatic.nonStaticMethod();
        System.out.println(exStatic.nonStaticString);

        ExStatic.printStatic();
        exStatic.printNonStatic();
        exStatic.printStatic();
    }
}
