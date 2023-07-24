package lesson10.nasledovanie.ex2;

public class Developer extends TeamMember{
    public Developer(String name, int age) {
        super(name, age,  "Developer");
    }

    @Override
    public void doWork(){
        super.doWork();
        System.out.println("I am developing");
    }
}
