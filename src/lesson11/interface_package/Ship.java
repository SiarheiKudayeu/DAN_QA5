package lesson11.interface_package;

public class Ship implements Move{
    @Override
    public void move() {
        System.out.println("Я плыву, я кораблик");
    }
}
