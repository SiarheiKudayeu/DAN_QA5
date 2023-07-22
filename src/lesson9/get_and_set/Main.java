package lesson9.get_and_set;

public class Main {
    public static void main(String[] args) {
        GetAndSet test = new GetAndSet();
        System.out.println(test.getFirst());
        test.setFirst(33);
        System.out.println(test.getFirst());
    }
}
