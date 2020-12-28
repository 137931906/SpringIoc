package com.cykj.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Aspect
@Component
public class LogAspect {

    //指定在哪些类进行切入
    @Pointcut("@annotation(com.cykj.util.Log)")
    public void logPointCut(){

    }

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("logPointCut()")
    public void before(JoinPoint joinPoint){

    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @After("logPointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println("after");
        Map<String,Object> info = this.getlogInfo(joinPoint);
        System.out.println(info.get("module") +":"+ info.get("action") +":"+ info.get("remark"));
    }

    /**
     *
     * @param joinPoint
     */
    @AfterThrowing("logPointCut()")
    public void throwing(JoinPoint joinPoint){

    }

    private Map<String,Object> getlogInfo(JoinPoint joinPoint){
        Map<String,Object> info = new HashMap<>();
        MethodSignature ms = (MethodSignature)joinPoint.getSignature();
        Method m = ms.getMethod();
        Log log = m.getAnnotation(Log.class);
        //获取自定义注解的值
        info.put("module",log.module());
        info.put("action",log.action());
        info.put("remark",log.remark());
        return info;
    }
}

