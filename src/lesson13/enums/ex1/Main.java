package lesson13.enums.ex1;

public class Main {
    public static void startAppOnPlatform(Platforms platforms) {
        if (platforms.equals(Platforms.ANDROID)) {
            System.out.println("Запуск приложения на андроид");
        } else if (platforms.equals(Platforms.IOS)) {
            System.out.println("Запуск приложения на IOS");
        } else if (platforms.equals(Platforms.WINDOWS)) {
            System.out.println("Запуск приложения на Windows");
        } else {
            System.out.println("Некорректная платформа");
        }
    }

    public static void main(String[] args) {
        startAppOnPlatform(Platforms.ANDROID);
        System.out.println("=============");
        startAppOnPlatform(Platforms.IOS);
        System.out.println("=============");
        startAppOnPlatform(Platforms.WRONG_PLATFORM);
    }
}
