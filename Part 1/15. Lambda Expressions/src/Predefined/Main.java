package Predefined;

import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        Function<Integer, String> factorial = (n) -> {
            Integer result = 1;
            for(int i = 2; i <= n; ++i){
                result *= i;
            }
            return result.toString();
        };

        System.out.println(factorial.apply(4));
        System.out.println(factorial.apply(10));
    }
}
