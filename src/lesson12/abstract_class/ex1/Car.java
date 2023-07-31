package lesson12.abstract_class.ex1;

public class Car extends Vehicles{
    public Car(String name, int cost) {
        super(name, cost);
    }

    @Override
    void move() {
        System.out.println("Я еду." + getName());
    }
}
