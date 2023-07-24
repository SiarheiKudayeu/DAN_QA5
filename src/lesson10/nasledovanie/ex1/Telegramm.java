package lesson10.nasledovanie.ex1;

public class Telegramm extends Messenger {
    public Telegramm(String name, int size, int space) {
        super(name, size, space);
    }

    public Telegramm(){
        super();
    }

/*    public Telegramm(String name, int size, int space){
        super(name, size, space);
    }*/

    public void audioCalls() {
        System.out.println("Я могу делать аудиозвонки");
    }
    @Override
    public void sendMessage(){
        System.out.println("Я могу отправлять сообщения. Я ведь телеграмм");
    }
}
