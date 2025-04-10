package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Uzaif", "Mihir", "Mahek", "Nihal", "Abdullah", "Vaishnavi", "Aditya", "Bhushan");

        //Convert to Upper cse
        System.out.println("To Upper Case");
        names.stream().
                map(String::toUpperCase).
                forEach(System.out::println);

        // Count names starting with 'A'
        long countA = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Names starting with A: " + countA);

        // Group by length
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);

        List<String> peekExample = names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .collect(Collectors.toList());

        names.parallelStream()
                .peek(name -> System.out.println("Thread: " + Thread.currentThread().getName() + " processing " + name))
                .forEach(name -> {
                });
    }
}
