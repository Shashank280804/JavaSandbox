package Oops.Abstraction;

interface Vehicle {

    void start();
    void stop();
}

public class Interface implements Vehicle {

    @Override
    public void start() {
        System.out.println("Vehicle started");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public static void main(String[] args) {

        Interface car = new Interface();

        car.start();
        car.stop();
    }
}
