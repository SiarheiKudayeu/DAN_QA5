package lesson10.nasledovanie.ex2;

public class Main {
    public static void main(String[] args) {
        TeamMember teamMember = new TeamMember("Ivan", 32, "PM");
        teamMember.doWork();
        System.out.println("===============");
        QA qa = new QA("Alona", 25);
        qa.doWork();
        System.out.println("===============");
        Developer developer = new Developer("Misha", 29);
        developer.doWork();
    }
}
