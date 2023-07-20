package lesson8;

public class Animal {

    public String name;
    public String species;
    public int age;
    public boolean result;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //метод не принимающий значений и не возвращающий ничего
    public void getInfo() {
        System.out.println("Имя животного " + name);
        System.out.println("Вид животного " + species);
        System.out.println("Возраст животного " + age);
    }

    //метод не принимающий значений и возвращающий значение
    public String nameOfBarsik() {
        String barsikName = "Barsik " + age;
        return barsikName;
    }

    //метод принимающий значений и не возвращающий значение
    public void someAction(String action, int count) {
        System.out.println("Мое животное умеет делать " + action + " " + count + " раз");
    }

    //метод принимающий значений и возвращающий значение
    public int howMuchCanILiveMore(int averageAge){
        return averageAge - age;
    }

    public int howMuchCanILiveMore(int averageAge, String text){
        System.out.println(text);
        return averageAge - age;
    }


}

