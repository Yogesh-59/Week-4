package org.javaAnnotations.repeatableAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BugReports {
        BugReport[] value();
    }

