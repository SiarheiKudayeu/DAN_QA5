package lesson2;

public class Casting {
    public static void main(String[] args) {
        int x = 13;
        int y = x;
        System.out.println(y);

        byte myByte = 100;
        int myInt = myByte;
        System.out.println(myInt);

        int myInt2 = 129;
        byte myByte2 = (byte) myInt2;
        System.out.println(myByte2);

        char myChar ='Q';
        char myChar2 ='q';
        System.out.println(myChar);

        int gorshock = myChar;
        int myCharValue2 = myChar2;
        System.out.println(gorshock);
        System.out.println(myCharValue2);

    }
}
