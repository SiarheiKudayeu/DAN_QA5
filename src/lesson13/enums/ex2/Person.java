package lesson13.enums.ex2;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void whichGroupICanVisit() {
        if (money < Groups.METALLICA.getCostOfTicket()) {
            System.out.println(name + ", сиди дома. На концерты нет денег");
        } else if (money < Groups.ACDC.getCostOfTicket() && money > Groups.METALLICA.getCostOfTicket()) {
            System.out.println(name + ", you can go to " + Groups.METALLICA.getName());
        } else if (money < Groups.QUEEN.getCostOfTicket() && money > Groups.METALLICA.getCostOfTicket()) {
            System.out.println(name + ", you can go to " + Groups.METALLICA.getName() + " or " +
                    Groups.ACDC.getName());
        } else {
            System.out.println("Иди куда хочешь");
        }
    }
}
