package lesson11.dostyp_modifier.package1;

public class Class2 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.protectedString);
        System.out.println(class1.defaultString);
        System.out.println(class1.publicString);
        //System.out.println(class1.privateString);  - так нельзя
    }
}
