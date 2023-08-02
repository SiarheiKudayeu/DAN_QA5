package lesson13.enums.ex2;

public enum Groups {
    METALLICA("METALLICA", 4000), ACDC("AC/DC", 6000),
    QUEEN("QUEEN", 8000);

    private String name;
    private int costOfTicket;

    public String getName() {
        return name;
    }

    public int getCostOfTicket() {
        return costOfTicket;
    }

    Groups(String name, int costOfTicket) {
        this.name = name;
        this.costOfTicket = costOfTicket;
    }
}
