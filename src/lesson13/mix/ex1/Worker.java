package lesson13.mix.ex1;

public class Worker {
    private String name;
    private int salary;
    private int countOfFriends;

    public Worker(String name, int salary, int countOfFriends) {
        this.name = name;
        this.salary = salary;
        this.countOfFriends = countOfFriends;
    }

    public String getName() {
        return name;
    }

    private void isItDayOff(DaysOfWeek day) throws NotWeekEndException {
        if (day.equals(DaysOfWeek.SUNDAY) || day.equals(DaysOfWeek.SATURDAY)) {
            System.out.println("Ура, выходные");
        } else {
            throw new NotWeekEndException("Сейчас будни. Иди работай");
        }
    }

    private void isSalaryEnough() throws LowSalaryException {
        if (salary < 3000) {
            throw new LowSalaryException("Лучше сэконмить.");
        } else {
            System.out.println("Вроде денег хватит");
        }
    }

    private void doYouHaveFriends() throws WithoutFriendsException {
        if (countOfFriends <= 0) {
            throw new WithoutFriendsException("Ты одинок...");
        } else {
            System.out.println("С друзьями все в порядке.");
        }
    }

    public void canIHaveParty(DaysOfWeek day) throws NotWeekEndException, LowSalaryException, WithoutFriendsException {
        isItDayOff(day);
        isSalaryEnough();
        doYouHaveFriends();
        System.out.println("Ура, " + name + " отдохнем.");
    }

}
