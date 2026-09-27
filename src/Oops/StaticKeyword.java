package Oops;

public class StaticKeyword {

    static String company = "Siddhatech";

    String name;

    StaticKeyword(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        StaticKeyword obj1 = new StaticKeyword("Shashank");
        StaticKeyword obj2 = new StaticKeyword("Rahul");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        System.out.println(StaticKeyword.company);
    }
}
