package com.shanshuan.annotation.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
    public  int min() default 0;
    public int max() default 150;
    public boolean isNotNull() default true;
}
