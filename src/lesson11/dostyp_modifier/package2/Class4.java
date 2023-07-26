package lesson11.dostyp_modifier.package2;

import lesson11.dostyp_modifier.package1.Class1;

public class Class4 extends Class1{


    public void soutProtected(){
        System.out.println(protectedString);
    }
    public void soutPublic(){
        System.out.println(publicString);
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
        class1.soutPrivate();

        Class4 class4 = new Class4();
        class4.soutProtected();
    }
}
