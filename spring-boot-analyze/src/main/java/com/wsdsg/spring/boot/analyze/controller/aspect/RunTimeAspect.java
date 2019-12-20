package com.wsdsg.spring.boot.analyze.controller.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/20 8:39
**/
@Component
@Aspect
@Slf4j
public class RunTimeAspect {

    @Pointcut("execution(* com.wsdsg.spring.boot.analyze.controller.*.*(..))")
    public void cutPointFuction(){}


    @Around("cutPointFuction()")
    public void doBefore(ProceedingJoinPoint joinPoint){
        long beginTime = System.currentTimeMillis();
        String functionName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        log.info(className+"."+functionName+"开始运行---->时间戳为:"+beginTime);
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - beginTime;
        log.info(className+"."+functionName+"结束运行---->时间戳为:"+beginTime);
        log.info(className+"."+functionName+"运行消耗了:"+totalTime+" 毫秒");
    }



}
