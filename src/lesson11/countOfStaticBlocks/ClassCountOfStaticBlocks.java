package lesson11.countOfStaticBlocks;

public class ClassCountOfStaticBlocks {
    static int counter;
    static {
        counter++;
    }

    static {
        counter++;
    }

    static {
        counter++;
    }

    static {
        counter++;
    }


    static {
        counter++;
        System.out.println("Number of static blocks is " + counter);
    }
}
