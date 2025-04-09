package lambda_expression;

@FunctionalInterface
interface StringProcessor {
    String process(String str);

    default String toUpperCase(String str) {
        return str.toUpperCase();
    }

    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

public class Task3 {
    public static void main(String[] args) {
        StringProcessor removeSpaces = str -> str.replaceAll("\\s", "");
        StringProcessor replaceVowels = str -> str.replaceAll("[aeiouAEIOU]", "*");

        String input = "Hello, Uzaif Here- Learning Functional Interface & Lambda Expression";

        System.out.println("Original: " + input);
        System.out.println("Removed Spaces: " + removeSpaces.process(input));
        System.out.println("Replaced Vowels: " + replaceVowels.process(input));
        System.out.println("To Uppercase: " + removeSpaces.toUpperCase(input));
        System.out.println("Reversed: " + StringProcessor.reverse(input));
    }
}

