package lesson11.final_keyword;

public class ClassFinalEx {

    public int inter = 16;
    public final int finalInt = 15;

    public void method(){
        System.out.println("Non final method");
    }

    public final void finalMethod(){
        System.out.println("final method");
    }

    public static void main(String[] args) {
        ClassFinalEx classFinalEx = new ClassFinalEx();
        classFinalEx.inter = 12;
        System.out.println(classFinalEx.inter);

        //classFinalEx.finalInt = 12;   запрещено менять значение константы
    }
}
