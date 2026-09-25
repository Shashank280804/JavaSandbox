package JavaBasics;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 23;
        boolean hasId = false;

        boolean condition1 = age >= 18;
        boolean condition2 = hasId;

        System.out.println(condition1 && condition2);
        System.out.println(condition1 || condition2);
        System.out.println(!condition2);
    }
}