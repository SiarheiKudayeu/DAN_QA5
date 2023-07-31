package lesson12.interfaces.ex2;

public class BodybuildingMan implements Sportable {
    private String name;

    public BodybuildingMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BodybuildingMan() {
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю качалку " + name);
    }
}
