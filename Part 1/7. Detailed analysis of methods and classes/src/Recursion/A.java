package Recursion;

public class A {
    public int fact(int n){
        if(n == 1) return 1;
        return n * fact(n - 1);
    }
}
