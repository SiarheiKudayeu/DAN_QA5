package lesson12.interfaces.ex3;

public class Mains implements Inter4{
    @Override
    public void inter1() {
        System.out.println("inter1");
    }

    @Override
    public void inter2() {
        System.out.println("inter2");
    }

    @Override
    public void inter3() {
        System.out.println("inter3");
    }

    @Override
    public void inter4() {
        System.out.println("inter4");
    }

    public static void main(String[] args) {
        Mains mains = new Mains();
        mains.inter1();
        mains.inter4();
        mains.inter4Defualt();
    }
}
