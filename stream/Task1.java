package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1{
    public static void main(String[] args) {
        List<String> programmingLanguages=Arrays.asList("Java","Python","R","C","C++");
        String longestString= programmingLanguages.stream().max(Comparator.comparingInt(String::length)).orElse("No String Found");
        System.out.println(longestString);

    }
}