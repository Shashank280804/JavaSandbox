package Java8;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> isAdult = age -> age >= 18;

        System.out.println(isAdult.test(23));
        System.out.println(isAdult.test(16));
    }
}