package lesson9.task;

public class Service {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service(String name) {
        this.name = name;
    }

    public void needToGoForToBeforeTrip(Contract contract, City city) {
        int distanceToCity = city.getDistance();
        int distanceForTo = contract.getHuman().getAuto().getDistanceBeforeTO();
        if (distanceForTo < distanceToCity) {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "    Прежде чем вы направитесь в " + city.getName() + " вам понадобится пройти ТО.");
        } else {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "    Езжайте в " + city.getName() + ". Но не забывайте, что согласно\n" +
                    "    договору " + contract.getId() + " вы обслуживаетесь у нас.\n" +
                    "    Ваша " + name + ".");
        }
    }
}
