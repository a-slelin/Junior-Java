package Annotations.RepeatableAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Container.class)
public @interface MyAnno {
    String str() default "Test";
    int value() default 9000;
}
