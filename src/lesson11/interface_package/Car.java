package lesson11.interface_package;

public class Car implements Move {
    @Override
    public void move() {
        System.out.println("Я еду, я машина.");
    }
}
