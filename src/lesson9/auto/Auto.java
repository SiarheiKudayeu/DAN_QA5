package lesson9.auto;

import java.util.Objects;

public class Auto {
    /*3)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
    создать геттеры и сеттеры для данных полей, а также конструктор класса,
    принимающий в параметры все поля данного класса.
    Создать вданном классе метод, который выводит в консоль всю информацию о имени
    автомобиля, его цене, и о том является он новым или нет.*/
    private String name;
    private int price;
    private boolean isNew;
    private int number;

    public Auto(String name, int price, boolean isNew, int number) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
        this.number = number;
    }

    public Auto(int price, boolean isNew) {
        this.price = price;
        this.isNew = isNew;
    }

    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void info() {
        System.out.println("name of car is " + name);
        System.out.println("price of car is " + price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return price == auto.price && Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString(){
        String result;
        if(isNew) {
            result = "Автомобиль новый";
        } else {
            result = "Автомобиль не новый";
        }
        return "Название автомобиля " + name + "\n" +
                "Цена автомобиля " + price + "\n" +
                result;
    }
}