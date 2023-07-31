package lesson12.interfaces.ex2;

public class CalisthenicsMan implements Sportable {
    private String name;

    public CalisthenicsMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CalisthenicsMan() {
    }

    @Override
    public void doSport() {
        System.out.println("Я люблю турник " + name);
    }
}
