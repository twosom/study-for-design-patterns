package com.icloud.proxy.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrefAspect {


    @Around("@annotation(com.icloud.proxy.java.HelloAnnotation)")
    public Object timestamp(ProceedingJoinPoint joinPoint) throws Throwable {
        long before = System.currentTimeMillis();
        joinPoint.proceed();
        System.out.println(System.currentTimeMillis() - before);
        return null;
    }
}
