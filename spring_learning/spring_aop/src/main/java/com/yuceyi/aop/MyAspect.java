package com.yuceyi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知: " + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后置通知: " + joinPoint.getSignature().getName() + ", ->" + ret);
    }

    public void myAfter() {
        System.out.println("最终通知: ");
    }

    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前: " + joinPoint.getSignature().getName());
        Object obj = joinPoint.proceed();
        System.out.println("环绕通知后: " + joinPoint.getSignature().getName());
        return obj;
    }

    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("抛出异常通知 ： " + e.getMessage());
    }
}
