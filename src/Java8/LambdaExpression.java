package Java8;

public class LambdaExpression {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Task is running");
        };

        task.run();
    }
}
