package CapturingVariable;

public class Main {
    public static void main(String[] args){
        int num = 10;

        MyFunc mf = (n) -> {
            int val = num + n;
            return val;
        };

        //num = 8;
    }
}
