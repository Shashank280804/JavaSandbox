package Collections;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(103, "Amit");
        students.put(101, "Shashank");
        students.put(102, "Rahul");

        System.out.println(students);
    }
}