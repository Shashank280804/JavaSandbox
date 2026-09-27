package Oops.Polymorphism;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class MethodOverriding extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        MethodOverriding obj = new MethodOverriding();

        obj.sound();
    }
}