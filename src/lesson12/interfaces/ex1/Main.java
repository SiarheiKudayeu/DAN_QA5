package lesson12.interfaces.ex1;

public class Main {
    public static void main(String[] args) {
        AdultPerson person = new AdultPerson("Вася");
        ChildPerson childPerson = new ChildPerson("Данил");
        person.read();
        childPerson.read();

        Learnable adultPerson = new AdultPerson("Alex");
        Learnable childPerson2 = new ChildPerson("Matt");
        adultPerson.watch();


        Learnable[] learnableReople = new Learnable[2];
        learnableReople[0] = adultPerson;
        learnableReople[1] = childPerson2;


    }
}
