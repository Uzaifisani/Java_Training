package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is powerful",
                "Stream API is useful",
                "Parallel stream is fast"
        );

        Map<String, Long> wordCount = sentences.parallelStream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println("Word frequencies: " + wordCount);
    }
}
