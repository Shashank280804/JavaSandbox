package Strings;

public class StringBasics {
    public static void main(String[] args) {

        String name = "Shashank";
        String message = "I am learning Java";


        int age = 23;
        System.out.println(message);

        System.out.println(name);
        System.out.println(message.contains("Java"));
        System.out.println(message.contains("Python"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        System.out.println(name.length());
        System.out.println(name.startsWith("Sha"));
        System.out.println(name.endsWith("ank"));
        System.out.println(name.substring(0, 4));
        System.out.println(message.replace("Java", "Spring"));

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
    }
}