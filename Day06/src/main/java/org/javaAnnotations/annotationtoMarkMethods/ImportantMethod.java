package org.javaAnnotations.annotationtoMarkMethods;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
}
