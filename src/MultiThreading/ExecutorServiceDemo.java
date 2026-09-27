package MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Runnable task1 = () ->
                System.out.println("Task 1 running");

        Runnable task2 = () ->
                System.out.println("Task 2 running");

        Runnable task3 = () ->
                System.out.println("Task 3 running");

        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);

        executor.shutdown();
    }
}
