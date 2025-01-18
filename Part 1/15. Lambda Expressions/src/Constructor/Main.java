package Constructor;

import java.util.function.Function;

public class Main {
    public static void main(String[] args){
        Function<String, String> toString = String::new;
        System.out.println(toString.apply(" df"));
    }
}

