package lesson10.nasledovanie.ex1;

public class Messenger {
    public String name;
    public int size;

    public Messenger(String name, int size, int space) {
        this.name = name;
        this.size = size;
        this.space = space;
    }

    //public Messenger(){}

    public int space;

    public Messenger() {

    }

    public void sendMessage(){
        System.out.println("Я могу отправлять сообщения. Я ведь мессенджер");
    }
}
