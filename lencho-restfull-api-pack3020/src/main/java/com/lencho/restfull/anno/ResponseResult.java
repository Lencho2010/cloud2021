package com.lencho.restfull.anno;

import java.lang.annotation.*;

/**
 * @author Lencho
 * @create 2021-07-31 10:27
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
}
