package lesson12.abstract_class.ex1;

public class Ship extends Vehicles{
    public Ship(String name, int cost) {
        super(name, cost);
    }

    @Override
    void move() {
        System.out.println("Я кораблик я плыву. " + getName());
    }
}
