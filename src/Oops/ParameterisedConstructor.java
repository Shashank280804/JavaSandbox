package Oops;

public class ParameterisedConstructor {
    String name;
    int age;

    ParameterisedConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ParameterisedConstructor obj = new ParameterisedConstructor("Shashank", 23);

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
