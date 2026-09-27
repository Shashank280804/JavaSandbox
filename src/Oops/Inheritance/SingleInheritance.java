package Oops.Inheritance;

class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

public class SingleInheritance extends Animal {

    void walk() {
        System.out.println("Animal walks");
    }

    public static void main(String[] args) {

        SingleInheritance obj = new SingleInheritance();

        obj.eat();
        obj.walk();
    }
}