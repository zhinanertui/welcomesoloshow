package com.soloshow.welcomesoloshow.aspect.annimation;

import java.lang.annotation.*;

/**
 * @Author xsw
 * @Date 2018/12/04
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Test {
    String value();
}