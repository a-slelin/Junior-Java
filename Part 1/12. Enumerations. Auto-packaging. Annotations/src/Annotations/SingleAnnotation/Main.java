package Annotations.SingleAnnotation;

import java.lang.reflect.Method;

public class Main {
    @Single(5)
    public static void myMeth1(){
        Main ob = new Main();
        try {
            Method m = ob.getClass().getMethod("myMeth1");
            System.out.println(m.getAnnotation(Single.class).value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method was not found.");
        }
    }
    @SomeSingle(1)
    public static void myMeth2(){
        Main ob = new Main();
        try {
            Method m = ob.getClass().getMethod("myMeth2");
            System.out.println(m.getAnnotation(SomeSingle.class).value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method was not found.");
        }
    }
    public static void main(String[] args){
        myMeth1();
        myMeth2();
    }
}
