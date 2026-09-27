package Collections;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Shashank");
        names.add("Rahul");
        names.add("Amit");

        names.addFirst("Rohit");
        names.addLast("Vikas");

        System.out.println(names);

        names.removeFirst();
        names.removeLast();

        System.out.println(names);
    }
}