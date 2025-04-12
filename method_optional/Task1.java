package method_optional;

import java.util.Arrays;

public class Task1 {
    public static boolean isEven(int no){
        return no%2==0;
    }
    public static void main(String[] args) {
        
        Arrays.asList(2,3,4,5,6,7,8,9)
        .stream()
        .filter(Task1::isEven)
        .forEach(System.out::println);
    }
}
