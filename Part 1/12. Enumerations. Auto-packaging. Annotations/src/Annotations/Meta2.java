package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Class annotation")
@MyAnnotation(str = "Meta2", val = 99)
public class Meta2 {

    @What(description = "Method annotation")
    @MyAnnotation(str = "myMeth", val = 100)
    public static void myMeth() {
        try {
            Class<Meta2> _class_ = Meta2.class;
            Annotation[] class_annotations = _class_.getAnnotationsByType(What.class);
            System.out.println("All class annotations:");
            for (Annotation a : class_annotations) {
                System.out.println(a.toString());
            }

            Method _method_ = _class_.getMethod("myMeth");
            Annotation[] method_annotations = _method_.getAnnotations();
            System.out.println("All method myMeth annotations:");
            for (Annotation a : method_annotations) {
                System.out.println(a.toString());
            }
        } catch(NoSuchMethodException e) {
            System.out.println("Method was not found");
        }
    }
}
