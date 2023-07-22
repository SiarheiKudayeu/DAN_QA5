package lesson9.task;

public class Contract {
    private int id;
    private Human human;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Contract(int id, Human human) {
        this.id = id;
        this.human = human;
    }
}
