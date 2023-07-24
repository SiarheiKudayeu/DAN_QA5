package lesson10.nasledovanie.ex2;

public class QA extends TeamMember{

    public QA(String name, int age) {
        super(name, age,  "Quality Assurance");
    }

    @Override
    public void doWork(){
        super.doWork();
        System.out.println("I am testing");
    }
}
