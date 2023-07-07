package lesson5.while_do;

public class WhileTry {
    public static void main(String[] args) {
/*        System.out.println("This message number 1");
        System.out.println("This message number 2");
        System.out.println("This message number 3");
        System.out.println("This message number 4");
        System.out.println("This message number 5");
        System.out.println("This message number 6");
        System.out.println("This message number 7");
        System.out.println("This message number 8");
        System.out.println("This message number 9");*/


     /*   int iterator = 1;
        while (iterator < 10) {
            System.out.println("This message number " + iterator);
            iterator++;
        }*/

/*        int iterator = 1;
        while (true){
            System.out.println("This message number " + iterator);
            iterator++;
            if(iterator == 10){
                break;
            }
        }*/

        int count = 20;
        while (count > 0) {
            if (count % 2 != 0){
                count--;
                continue;
            }
            System.out.println(count);
            count--;
        }

    }
}
