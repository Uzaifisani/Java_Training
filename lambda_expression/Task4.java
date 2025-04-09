package lambda_expression;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("Uzaif", "Rafique", "Isani");

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Even Numbers:");
        numbers.stream().filter(isEven).forEach(System.out::println);

        Consumer<Integer> printNumber = num -> System.out.println("Number: " + num);
        System.out.println("\nUsing Consumer:");
        numbers.forEach(printNumber);

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("\nString lengths:");
        List<Integer> lengths = strings.stream()
                                       .map(stringLength)
                                       .collect(Collectors.toList());
        lengths.forEach(System.out::println);
    }
}

