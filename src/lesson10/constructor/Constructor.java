package lesson10.constructor;

public class Constructor {
    int x;
    int y;
    String z;
    boolean w;

    public Constructor(int x, int y, String z, boolean w) {
        this(x,z);
        this.y = y;
        this.w = w;
    }

    public Constructor(int x, String z) {
        this.x = x;
        this.z = z;
    }
}
