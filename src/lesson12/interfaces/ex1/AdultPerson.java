package lesson12.interfaces.ex1;

public class AdultPerson implements Learnable, Workable{
    private String name;

    public AdultPerson(String name) {
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
        System.out.println("Я читаю научные статьи");
    }

    @Override
    public void listen() {
        System.out.println("Слушаю умные подкасты");
    }

    @Override
    public void watch() {
        System.out.println("Смотрю все об айти");
    }

    @Override
    public void work() {
        System.out.println("Я работаю на работе");
    }
}
