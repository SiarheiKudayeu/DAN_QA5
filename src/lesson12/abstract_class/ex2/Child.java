package lesson12.abstract_class.ex2;

public class Child extends AbstractClass implements Inter1, Inter2{

    @Override
    void doSmth() {
        System.out.println("doSmth");
    }

    @Override
    public void inter1() {
        System.out.println("inter1");
    }

    @Override
    public void abstractVoidEverywhere() {
        System.out.println("abstractVoidEverywhere");
    }

    @Override
    public void inter2() {
        System.out.println("inter2");
    }
}
