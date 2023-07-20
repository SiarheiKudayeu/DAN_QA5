package lesson8;

public class Main2 {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Minimum of array is "+ test.arrayMin(10));

        Animal bobik = new Animal();
        System.out.println(bobik.getName());
        bobik.setName("Bobik");
        System.out.println(bobik.getName());
        bobik.getInfo();
    }
}
