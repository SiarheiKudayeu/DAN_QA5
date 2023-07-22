package lesson9.constructor;

public class Home {
    private String address;
    private int capacity;
    private int countOfFloors;
    private boolean isNew;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void getInfo() {
        System.out.println("Address is " + getAddress());
        System.out.println("Capacity is " + getCapacity());
        System.out.println("countOfFloors is " + countOfFloors);
        System.out.println("isNew " + isNew);
    }

    public Home(String address, int capacity, int countOfFloors, boolean isNew) {
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }

    public Home(String address, int capacity, boolean isNew, int countOfFloors) {
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }

    public Home(boolean isNew, int capacity, int countOfFloors) {
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
        this.address = "Паникахи";
    }

    public Home() {
    }

    public Home(int capacity) {
        this.capacity = capacity;
        this.address = "Паникахи";
    }

    public Home(int countOfFloors, int capacity){
        this(capacity);
        this.countOfFloors = countOfFloors;
        this.isNew = false;
    }

    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                ", capacity=" + capacity +
                ", countOfFloors=" + countOfFloors +
                ", isNew=" + isNew +
                '}';
    }
}
