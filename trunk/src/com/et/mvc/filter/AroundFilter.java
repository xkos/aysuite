package com.et.mvc.filter;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 单环绕过滤器注解
 * @author stworthy
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AroundFilter {
    Class<?> execute();
    String[] except() default {};
    String[] only() default {};
}
