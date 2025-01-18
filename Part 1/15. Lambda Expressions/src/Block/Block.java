package Block;

public class Block {
    public static void main(String[] args){
        NumericalFunc factorial = (int n) -> {
            int result = 1;

            for(int i = 2; i <= n; ++i) {
                result *= i;
            }

            return result;
        };
        System.out.println(factorial.Method(5));



        StringFunc reverse = (str) -> {
            String result = "";

            for(int i = str.length() - 1; i > -1; --i){
                result += str.charAt(i);
            }

            return result;
        };
        System.out.println(reverse.func("123456j6"));
    }
}
