package Methods;

public class ReturnType {

    static int add(int a, int b) {
        return a + b;
    }

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result = add(10, 20);
        System.out.println(result);

        int answer = square(5);
        System.out.println(answer);
    }
}