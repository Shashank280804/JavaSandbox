package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 30, 20, 40, 50, 30);

        // 1. filter()
        List<Integer> filtered = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println("Filter: " + filtered);


        // 2. map()
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Map: " + doubled);


        // 3. sorted()
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + sorted);


        // 4. distinct()
        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct: " + distinct);


        // 5. limit()
        List<Integer> limited = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Limit: " + limited);


        // 6. skip()
        List<Integer> skipped = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("Skip: " + skipped);


        // 7. forEach()
        System.out.print("ForEach: ");

        numbers.stream()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();


        // 8. count()
        long count = numbers.stream()
                .count();

        System.out.println("Count: " + count);


        // 9. min()
        int minimum = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Min: " + minimum);


        // 10. max()
        int maximum = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Max: " + maximum);


        // 11. findFirst()
        int first = numbers.stream()
                .findFirst()
                .get();

        System.out.println("First: " + first);


        // 12. findAny()
        int any = numbers.stream()
                .findAny()
                .get();

        System.out.println("Any: " + any);


        // 13. anyMatch()
        boolean anyGreaterThan40 = numbers.stream()
                .anyMatch(n -> n > 40);

        System.out.println("Any > 40: " + anyGreaterThan40);


        // 14. allMatch()
        boolean allGreaterThan5 = numbers.stream()
                .allMatch(n -> n > 5);

        System.out.println("All > 5: " + allGreaterThan5);


        // 15. noneMatch()
        boolean noneNegative = numbers.stream()
                .noneMatch(n -> n < 0);

        System.out.println("None negative: " + noneNegative);


        // 16. reduce()
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);


        // 17. collect()
        List<Integer> result = numbers.stream()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Combined result: " + result);
    }
}