package lesson11.final_keyword;

public class ChildClass extends ClassFinalEx{
    @Override
    public void method(){
        System.out.println("I was overrided");
    }

/*    public void finalMethod(){

    }*/
    // запрещено переопределять final метод
}
