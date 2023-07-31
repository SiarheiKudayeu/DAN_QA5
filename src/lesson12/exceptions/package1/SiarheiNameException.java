package lesson12.exceptions.package1;

public class SiarheiNameException extends Exception{
    public String getMessage() {
        return "Не вводи имя Сергея.";
    }
}
