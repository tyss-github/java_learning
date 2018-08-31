package com.yuceyi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.yuceyi.aop.UserServiceImpl.*(..))")
    public void myPointCut() {}

    @Before(value="myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value="myPointCut()", returning="ret")
    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后置通知: " + joinPoint.getSignature().getName() + ", ->" + ret);
    }

    @After(value="myPointCut()")
    public void myAfter() {
        System.out.println("最终通知: ");
    }

    @Around(value="myPointCut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前: " + joinPoint.getSignature().getName());
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知后: " + joinPoint.getSignature().getName());
        return obj;
    }

    @AfterThrowing(value="myPointCut()", throwing="e")
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
}
