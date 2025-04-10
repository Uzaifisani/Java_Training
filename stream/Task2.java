package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(21,12,12,76,34);
        System.out.println("Sorted in Ascending :");
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("Sorted in Descending :");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
