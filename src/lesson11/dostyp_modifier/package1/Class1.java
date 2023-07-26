package lesson11.dostyp_modifier.package1;

public class Class1 {
    public String publicString = "publicString";
    private String privateString = "privateString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";

    public void soutPrivate(){
        System.out.println(privateString);
    }

    public String getPrivateString(){
        return privateString;
    }
}
