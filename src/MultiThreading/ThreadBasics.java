package MultiThreading;
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadBasics {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        System.out.println("Main thread");
    }
}