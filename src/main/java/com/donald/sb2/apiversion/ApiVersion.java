package com.donald.sb2.apiversion;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiVersion {
    /**
     * 标识版本号，从1开始
     */
    int value() default 1;
}
