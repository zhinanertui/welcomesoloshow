package com.soloshow.welcomesoloshow.aspect.annimation;

import java.lang.annotation.*;

/**
 * @Author xsw
 * @Date 2018/12/04
 */
//修饰的对象范围
@Target({ElementType.METHOD, ElementType.TYPE})
//生命周期
@Retention(RetentionPolicy.RUNTIME)
//允许子类集成父类
@Inherited
//api 注解文档化
@Documented
public @interface Test {

    String value() default "";

}