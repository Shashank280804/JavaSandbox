package Collections;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Shashank");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(names);

        System.out.println(names.get(1));

        names.set(1, "Rohit");

        names.remove("Amit");

        System.out.println(names);
    }
}