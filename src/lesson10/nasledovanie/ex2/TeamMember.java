package lesson10.nasledovanie.ex2;

public class TeamMember {
    String name;
    int age;
    String profesion;

    public TeamMember(String name, int age, String profesion) {
        this.name = name;
        this.age = age;
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", profesion='" + profesion;
    }

    public void doWork(){
        System.out.println("I do my work.");
    }
}
