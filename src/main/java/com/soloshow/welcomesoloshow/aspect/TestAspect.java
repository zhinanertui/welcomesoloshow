package com.soloshow.welcomesoloshow.aspect;

import com.soloshow.welcomesoloshow.aspect.annimation.Test;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

/**
 * @author xsw
 * @since 2018/12/04
 */
@Aspect
@Component
@Slf4j
public class TestAspect {

    @Pointcut("@annotation(com.soloshow.welcomesoloshow.aspect.annimation.Test)")
    public void runs() {

    }

    //    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    public void runs(){
//    }
    @Before("runs()")
    public void before(JoinPoint joinPoint) {
        MethodSignature sign = (MethodSignature) joinPoint.getSignature();
        Method method = sign.getMethod();
        RequestMapping annotation = method.getAnnotation(RequestMapping.class);
        System.out.println(annotation.toString());
        // System.out.print("打印："+annotation.pattern()+" 开始前");
    }

    @Around("runs()")
    public Object advice(ProceedingJoinPoint joinPoint) {
        System.out.println("通知之开始");
        Object retmsg = null;
        try {
            retmsg = joinPoint.proceed();
            System.err.println("++++++++" + retmsg);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        log.info("通知之结束");
        return retmsg;
    }

    @After("runs()")
    public void after() {
        log.info("after方法执行后");
    }
}
