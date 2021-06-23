package com.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Spring AOP
 */
@Component
@Aspect
public class BookAspect {

    /**
     * 定义切点
     */
    @Pointcut("execution(* com.service.BookService.getById(..))")
    public void getPointcut() {
    }


    /**
     * 在目标方法之前执行的通知方法
     * @param joinPoint 切点
     */
    @Before(value = "getPointcut()")
    public void before(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("方法: " + joinPoint.getSignature() + "即将执行，参数列表：" + Arrays.asList(args));
    }
    /**
     * 在目标方法之后执行的通知方法
     * @param joinPoint 切点
     */
    @After(value = "getPointcut()")
    public void after(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法: " + methodName + "执行完毕");
    }

    /**
     * 目标方法正常返回时的通知方法
     * @param joinPoint 切点
     * @param result 目标方法的返回值，通过@AfterReturning定义
     * 注：当通知方法存在多个参数时，JoinPoint必须放在第一位
     */
    @AfterReturning(pointcut = "getPointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法: " + methodName + "  返回值为： " + result);
    }


    /**
     * 目标方法发生异常时的通知方法
     * @param joinPoint 切点
     * @param ex 目标方法抛出的异常，通过@AfterThrowing定义
     * 注：当通知方法存在多个参数时，JoinPoint必须放在第一位
     */
    @AfterThrowing(value = "getPointcut()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("方法: " + methodName + " 抛出异常，异常信息为： " + ex);
    }

/*    //  使用 @Around 注解来同时完成前置和后置通知
    @Around(value ="getPointcut()")
    public void around(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();

        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            // 异常通知
            System.out.println("The method "+methodName+ "AfterThrowing: ex = "+e);
            e.printStackTrace();
        }

    }*/


}
