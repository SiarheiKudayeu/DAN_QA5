package lesson13.exeptions.ex1;

public class Example {
    public static void main(String[] args) {
        try{
            System.out.println(12/0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("exit");

       /* int[] array = new int[3];
        System.out.println(array[6]);*/

    }
}
