package Strings;

public class StringComparison {
    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String x = new String("Java");
        String y = new String("Java");

        System.out.println(x == y);
        System.out.println(x.equals(y));

        String first = "Java";
        String second = "java";

        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase(second));
    }
}