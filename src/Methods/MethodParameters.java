package Methods;

public class MethodParameters {

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        greet("Shashank");
        greet("Rahul");

        add(10, 20);
        add(50, 30);
    }
}