package Oops.Inheritance;

class Animals {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animals {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance extends Dog {

    void play() {
        System.out.println("Puppy plays");
    }

    public static void main(String[] args) {

        MultilevelInheritance obj = new MultilevelInheritance();

        obj.eat();
        obj.bark();
        obj.play();
    }
}