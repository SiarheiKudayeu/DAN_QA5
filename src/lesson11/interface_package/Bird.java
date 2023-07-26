package lesson11.interface_package;

public class Bird implements Move, Eat{

    @Override
    public void move() {
        System.out.println("Я лечу, я птичка.");
    }

    @Override
    public void eat() {
        System.out.println("Я клюю.");
    }

    @Override
    public void drink() {
        System.out.println("Я пью из лужи.");
    }
}
