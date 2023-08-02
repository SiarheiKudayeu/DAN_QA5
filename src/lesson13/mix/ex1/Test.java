package lesson13.mix.ex1;

public class Test {
    /*    public enum Day{
            DAY1, DAY2, DAY3
        }*/
/*    public class LowException extends Exception {
        public LowException(String message) {
            super(message);
        }
    }

    public void test() throws LowException {
        if (12 < 10) {
            throw new LowException("asascas");
        }
    }*/
    public static void main(String[] args) {
        Worker worker1 = new Worker("Ivan", 4000, 4);
        try{
            worker1.canIHaveParty(DaysOfWeek.SATURDAY);
        } catch (LowSalaryException | NotWeekEndException | WithoutFriendsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("LOGIC");

    }
}
