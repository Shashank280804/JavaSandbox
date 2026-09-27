package ExceptionHandling;

public class Throw {

    public static void main(String[] args) {

        int age = 16;

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }
}