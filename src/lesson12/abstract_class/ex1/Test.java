package lesson12.abstract_class.ex1;

public class Test {
    public static void main(String[] args) {
        Ship ship = new Ship("Алые паруса", 100500);
        Car car = new Car("VW", 200500);
        car.move();
        ship.move();

        Cucuruznic cucuruznic = new Cucuruznic("Кукурузник", 12121, true);
        Istrebitel istrebitel = new Istrebitel("istrebitel", 23223, false);
        cucuruznic.move();
        istrebitel.move();
    }
}
