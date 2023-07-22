package lesson9.task;

public class Auto {
    private String name;

    public String getName() {
        return name;
    }

    public Auto(String name, int price, int distanceBeforeTO) {
        this.name = name;
        this.price = price;
        this.distanceBeforeTO = distanceBeforeTO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistanceBeforeTO() {
        return distanceBeforeTO;
    }

    public void setDistanceBeforeTO(int distanceBeforeTO) {
        this.distanceBeforeTO = distanceBeforeTO;
    }

    private int price;
    private int distanceBeforeTO;
}
