package lesson13.mix.ex2;

import java.util.Scanner;

public class PersonalCabinet {
    /*Создать класс PersonalCabinet, в котором создать приватное поле login типа String[].
     * Создать конструктор по умолчанию, который будет присваивать значение для login пустого массива размерностью 0.
     * Создать метод, который будет принимать в параметры следующие значения типа enums (LOGIN, AUTHENTICATION, LOGOUT, INCORRECT).
     *
     * Суть программы:
     * Пользователю предлагают ввести с клавиатуры действие до тех пор, пока он не введет слово STOP.
     * Если он вводит LOGIN, то у него просят ввести новый логин для этого пользователя, программа проверяет есть ли данный логин
     * в массиве login и если такого нет выводит сообщение типа "{newLogin} congratulation. You've been created new account".
     * А также добавляет этот введенный логин в массив login.
     * Если такой логин уже есть в массиве, то выбрасывается исключение типа DuplicateLoginException,которое нужно создать отдельно.
     * Также если пользователь вводит логин длиннее чем 20 символов то выбрасывается исключение типа LongFieldException,которое нужно создать отдельно.
     *
     * Если пользователь вводит AUTHENTICATION, то у пользователя просят ввести с клавиатуры его Логин,
     * программа проверяет есть ли данный логин в массиве login и если такой есть выводит сообщение типа: "Welcome back, {Логин}".
     * В противном случае выводит сообщение типа: "Invalid login".
     *
     * Если пользователь вводит LOGOUT то в консоль выводится сообщение типа: "See you soon".
     *
     * Если пользователь вводит другие данные, то в консоль выводится сообщение типа: "Incorrect action". */
    private String[] login;

    private PersonalCabinet() {
        this.login = new String[0];
    }

    private boolean isThisLoginExist(String login) {
        boolean result = false;
        for (int i = 0; i < this.login.length; i++) {
            if (this.login[i].equals(login)) {
                result = true;
            }
        }
        return result;
    }

    private void addNewLoginToArray(String newLogin) {
        String[] newArray = new String[login.length + 1];
        for (int i = 0; i < this.login.length; i++) {
            newArray[i] = login[i];
        }
        newArray[login.length] = newLogin;
        login = newArray;
    }

    private enum Actions {
        LOGIN("LOGIN"), AUTHENTICATION("AUTHENTICATION"), LOGOUT("LOGOUT"), INCORRECT("INCORRECT");
        private String name;

        Actions(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private void action(Actions actions) throws DuplicateLoginException, LongFieldException {
        Scanner scanner = new Scanner(System.in);

        switch (actions) {
            case LOGIN:
                System.out.println("Insert new Login:");
                String newLogin = scanner.nextLine();
                if (isThisLoginExist(newLogin)) {
                    throw new DuplicateLoginException("This value is already existing");
                }
                if (newLogin.length() > 20) {
                    throw new LongFieldException("The value is too long");
                }
                addNewLoginToArray(newLogin);
                System.out.println(newLogin + " congratulation. You've been created new account");
                break;
            case AUTHENTICATION:
                System.out.println("Insert your login:");
                String login = scanner.nextLine();
                if (isThisLoginExist(login)){
                    System.out.println("Welcome back, " + login);
                } else {
                    System.out.println("Invalid Login");
                }
                break;
            case LOGOUT:
                System.out.println("See you soon");
                break;
            case INCORRECT:
                System.out.println("Incorrect action.");
                break;
        }
    }
    public void startWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some action");
        String actionString = scanner.nextLine();
        while (!actionString.equals("STOP")){
            Actions actions;
            if(actionString.equals(Actions.LOGIN.getName())){
                actions = Actions.LOGIN;
            } else if (actionString.equals(Actions.AUTHENTICATION.getName())){
                actions = Actions.AUTHENTICATION;
            } else if (actionString.equals(Actions.LOGOUT.getName())){
                actions = Actions.LOGOUT;
            } else {
                actions = Actions.INCORRECT;
            }
            try {
                action(actions);
            } catch (DuplicateLoginException | LongFieldException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Insert some action");
            actionString = scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        PersonalCabinet cabinet = new PersonalCabinet();
        cabinet.startWork();
    }
}
