package lesson12.abstract_class.ex1;

public abstract class Plane extends Vehicles{
    public Plane(String name, int cost, boolean hasPropeller) {
        super(name, cost);
        this.hasPropeller =hasPropeller;
    }

    private boolean hasPropeller;
}
