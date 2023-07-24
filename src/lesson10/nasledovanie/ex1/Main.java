package lesson10.nasledovanie.ex1;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger("Mes", 12, 234);
        messenger.sendMessage();

        Telegramm telegramm = new Telegramm();
        telegramm.sendMessage();

        telegramm.audioCalls();
    }
}
