package Annotations.SingleAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SomeSingle {
    int value();
    int someParam() default 100;
    char k() default 't';
}
