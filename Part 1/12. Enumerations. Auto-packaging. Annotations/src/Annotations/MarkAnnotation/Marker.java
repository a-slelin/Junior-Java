package Annotations.MarkAnnotation;

import java.lang.reflect.Method;

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("Method with marker name " + MyMarker.class.getName());
            }
        } catch (Exception e) {
            System.out.println("Method was not found.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
