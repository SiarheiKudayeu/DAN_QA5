package lesson12.interfaces.ex3;

public interface Inter4 extends Inter3, Inter2, Inter1{
    void inter4();

    default void inter4Defualt(){
        System.out.println("inter4Defualt");
    }
}
