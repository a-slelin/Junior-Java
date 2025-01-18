package Annotations;

import java.lang.reflect.Method;

public class Meta {
    public Meta() {}

    @MyAnnotation(str = "Example", val = 100)
    public static void meth(String str, int value) {
        try {
            Class c = Meta.class;
            Method m = c.getMethod("meth", String.class, int.class);
            MyAnnotation MyAnno = m.getAnnotation(MyAnnotation.class);

            System.out.println(MyAnno.str() + " " + MyAnno.val());
        }
        catch (NoSuchMethodException e) {
            System.out.println("Method wasn't found.");
        }
    }
}
