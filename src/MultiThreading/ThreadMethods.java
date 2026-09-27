package MultiThreading;
public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            System.out.println("Worker thread finished");
        });

        thread.start();

        thread.join();

        System.out.println("Main thread finished");
    }
}
