package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<List<Integer>> numbers=Arrays.asList(
            Arrays.asList(1, 2, 15, 20),
            Arrays.asList(10, 20, 30, 5),
            Arrays.asList(15, 25, 5)
        );
        List<Integer> result = numbers.stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());

        System.out.println("Flat Map:"+result);

        System.out.println("Distinct");
        result.stream().distinct().forEach(System.out::println);

        System.out.println("Filter");
        result.stream().filter((n)->n>10).forEach(System.out::println);

        System.out.println("Sorted");
        result.stream().sorted().forEach(System.out::println);
    }
}
