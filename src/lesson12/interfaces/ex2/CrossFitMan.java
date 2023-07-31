package lesson12.interfaces.ex2;

public class CrossFitMan implements Sportable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CrossFitMan(String name) {
        this.name = name;
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю кроссфит " + name);
    }
}
