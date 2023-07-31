package lesson12.abstract_class.ex1;

public class Cucuruznic extends Plane{
    public Cucuruznic(String name, int cost, boolean hasPropeller) {
        super(name, cost, hasPropeller);
    }

    @Override
    void move() {
        System.out.println("верчу пропеллер");
    }
}
