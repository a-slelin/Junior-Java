import java.util.Locale;

public class AsArg {
    public static String StringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args){
        String inStr = "Lambdas add power to Java.";
        String outStr;

        System.out.println(inStr);

        outStr = StringOp((str) -> str.toUpperCase(), inStr);
        System.out.println(outStr);

        outStr = StringOp((str) -> {
            String result = "";

            for(int i = 0; i != str.length(); ++i){
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }

            return result;
        }, inStr);
        System.out.println(outStr);

        StringFunc reverse = (str) -> {
            String result = " ";
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        } ;
        System.out.println(StringOp(reverse, inStr));
    }
}
