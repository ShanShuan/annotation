package com.shanshuan.annotation.annotation;

import java.lang.annotation.*;


@Documented //注解包含在javadoc中
@Inherited //注解可以被继承
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ ElementType.FIELD, ElementType.METHOD })// 字段、枚举的常量  --方法
public @interface  Int {
    public String value() default "";
}
