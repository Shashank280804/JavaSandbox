package Collections;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Amit");
        students.put(101, "Shashank");
        students.put(102, "Rahul");

        System.out.println(students);
    }
}