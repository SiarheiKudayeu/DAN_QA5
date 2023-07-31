package lesson12.interfaces.ex2;

public class Main13 {
    public static void main(String[] args) {
        Sportable sportsmen1 = new CalisthenicsMan("Alex");
        Sportable sportsman2 = new BodybuildingMan("Mirco");
        Sportable sportsman3 = new CrossFitMan("Tupak");
        sportsmen1.doSport();
        System.out.println("===================");
        Sportable[] arrayOfSportsmans = {sportsmen1, sportsman2, sportsman3};
        for (int i = 0; i < arrayOfSportsmans.length; i++) {
            arrayOfSportsmans[i].doSport();
        }
        System.out.println("===================");
        for (Sportable man : arrayOfSportsmans) {
            man.doSport();
        }
    }
}
