package lesson10.bear;

public class Bear {
    private String name;
    private boolean isMale;
    private int age;

    public Bear(String name, boolean pol) {
        this.name = name;
        this.isMale = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPol() {
        return isMale;
    }

    public void setPol(boolean pol) {
        this.isMale = pol;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void roar() {
        System.out.println("RRRRRRRRRR!!!");
    }

    public Bear makeBabyBear(String name, boolean isMale, Bear aboba) {
        if (this.isMale == aboba.isMale) {
            return new Bear(null, false);
        } else {
            return new Bear(name, isMale);
        }
    }

    @Override
    public String toString() {
        String result;
        if (name == null) {
            result = "Мужики вы чо?";
        } else {
            result = "Bear{" +
                    "name='" + name + '\'' +
                    ", isMale=" + isMale +
                    ", age=" + age +
                    '}';
        }
        return result;
    }

    public static void main(String[] args) {
        Bear bumba = new Bear("bimba", true);
        Bear bimba = new Bear("Burunchik", true);
        Bear mikroChelik = new Bear("prosti", false);

        System.out.println(mikroChelik.makeBabyBear("biba", false, bimba));
        System.out.println(bimba.makeBabyBear("biba2", false, bumba));
    }
}
