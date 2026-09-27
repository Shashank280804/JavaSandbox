package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Shashank");
        names.add("Rahul");
        names.add("Amit");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            String name = iterator.next();

            System.out.println(name);
        }
    }
}