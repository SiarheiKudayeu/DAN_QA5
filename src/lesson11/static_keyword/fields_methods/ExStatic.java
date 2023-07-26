package lesson11.static_keyword.fields_methods;

public class ExStatic {
    public String nonStaticString = "nonStaticString";
    public void nonStaticMethod(){
        System.out.println("I am nonStaticMethod");
    }

    public static String staticString = "staticString";
    public static void staticMethod(){
        System.out.println("I am staticMethod");
    }

    public void printNonStatic(){
        System.out.println(nonStaticString);
        System.out.println(staticString);
        nonStaticMethod();
        staticMethod();
    }

    public static void printStatic(){
           // System.out.println(nonStaticString);
            System.out.println(staticString);
           // nonStaticMethod();
            staticMethod();
    }



    public static void main(String[] args) {
        staticMethod();
        System.out.println(staticString);
        System.out.println("==============");
        ExStatic exStatic = new ExStatic();
        exStatic.nonStaticMethod();
        System.out.println(exStatic.nonStaticString);
    }
}
