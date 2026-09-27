package Oops;

public class ThisKeyword {

    String name;
    int age;

    ThisKeyword(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        ThisKeyword student = new ThisKeyword("Shashank", 23);

        System.out.println(student.name);
        System.out.println(student.age);
    }
}