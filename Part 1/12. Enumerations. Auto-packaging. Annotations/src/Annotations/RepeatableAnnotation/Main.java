package Annotations.RepeatableAnnotation;

import java.lang.reflect.Method;

public class Main {
    @MyAnno(str = "First Annotation", value = -1)
    @MyAnno(str = "Second Annotaion", value = 100)
    public static void myMeth(String str, int tmp) {
        try {
            Method m = Main.class.getMethod("myMeth", String.class, int.class);

            for(MyAnno ann: m.getAnnotation(Container.class).value()) {
                System.out.println(ann.str() + " " +  ann.value());
            }

            for(MyAnno ann: m.getAnnotationsByType(MyAnno.class)) {
                System.out.println(ann.str() + " " +  ann.value());
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method was not found.");
        }
    }
    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
