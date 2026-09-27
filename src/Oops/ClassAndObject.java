package Oops;

public class ClassAndObject {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Shashank";
        student1.age = 23;

        System.out.println(student1.name);
        System.out.println(student1.age);
    }
}

class Student {

    String name;
    int age;
}