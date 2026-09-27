package Collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Shashank");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println(students);

        System.out.println(students.get(102));

        students.put(102, "Rohit");

        System.out.println(students);
    }
}