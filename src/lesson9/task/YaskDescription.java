package lesson9.task;

public class YaskDescription {
    /*
   Написать метод при помощи объектного подхода.
   Которая будет выводить сообщение о том нужно ли человеку,
   владеющему автомобилем и имеющему договор с автосервисом
   перед поездкой в какой-нибудь город пройти ТО.

   Решение о том, нужно ли человеку проходить ТО, происходит в атосервисе.
   Для этого у человека должен быть заключен контракт с сервисом.

   В контракте содержится id этого контракта, и закрепленный к нему человек
   с определенным именем.

   У каждого автомобиля есть цена, назавание, расстояние до прохождения ТО.

   Автомобиль закреплен за определенным человеком.

   Если при поездке в определеный город, пробег после финального ТО превышает расстояние,
   после проезда которго автомобиль должен проходить ТО. То на консоль выводится сообщение типа:

   Уважаемый {Имя человека}.
   Прежде чем вы направитесь в {Название города} вам понадобится пройти ТО.

   Уважаемый {Имя человека}.
   Езжайте в {Название города}. Но не забывайте, что согласно
   договору {айди договора} вы обслуживаетесь у нас.
   Ваша {Название Сервиса}.*/
    public static void main(String[] args) {
        Service service = new Service("Шаловливая компрессия");
        Auto auto = new Auto("Ford", 4500, 4000);
        Human human = new Human("Феофан", auto);
        Contract contract = new Contract(12345, human);
        City city = new City("Киев", 600);

        service.needToGoForToBeforeTrip(contract, city);

        System.out.println("===================");

        service.needToGoForToBeforeTrip(new Contract
                        (12345, new Human("Феофан", new Auto
                                ("Ford", 4500, 4000))),
                new City("Киев", 6000));


    }
}