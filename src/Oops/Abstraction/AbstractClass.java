package Oops.Abstraction;

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}

public class AbstractClass extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        AbstractClass dog = new AbstractClass();

        dog.sound();
        dog.eat();
    }
}