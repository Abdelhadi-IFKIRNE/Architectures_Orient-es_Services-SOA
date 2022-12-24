package org.example.apsects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class verify {

    @Around("execution(* org.example.service.metierImpl.*(..))")
    public Object verifyMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       System.out.println("before.....");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("After");
        return proceed;
    }
}
