package lesson12.interfaces.ex1;

public class ChildPerson implements Learnable {
    private String name;

    public ChildPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println("Мне читает мама.");
    }

    @Override
    public void listen() {
        System.out.println("Я слушаю сказки");
    }

    @Override
    public void watch() {
        System.out.println("Я смотрю мультик");
    }
}
