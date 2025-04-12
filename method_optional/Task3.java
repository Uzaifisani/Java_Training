package method_optional;

import java.util.function.BiFunction;

public class Task3 {
    public static int Adder(int i,int j){
        return i+j;
    }
    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> adderBiFunction= Task3::Adder;

        System.out.println(adderBiFunction.apply(5, 5));
    }
}
