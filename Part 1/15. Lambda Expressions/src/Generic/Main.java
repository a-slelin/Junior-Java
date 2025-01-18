package Generic;

public class Main {
    public static void main(String[] args){
        SomeFunc<String> reverse = (str) -> {
            String result = "";

            for(int i = str.length() - 1; i > -1; --i){
                result += str.charAt(i);
            }

            return result;
        };


        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for(int i = 2; i <= n; ++i) {
                result *= i;
            }

            return result;
        };

        System.out.println(reverse.func("lsdjflksj"));
        System.out.println(factorial.func(10));
    }
}
