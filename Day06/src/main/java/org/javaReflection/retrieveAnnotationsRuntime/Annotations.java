package org.javaReflection.retrieveAnnotationsRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
}
@Author(name = "Jane Doe")
public class Annotations {
}
