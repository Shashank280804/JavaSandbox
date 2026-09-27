package Oops.Inheritance;

class Animalss {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Animalss {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}