package com.example.springaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public aspect verificationAspect {

    @Around("execution(* com.example.springaop.service.ImetierImpl.getInformation())")
    public void verify(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("Bonjour ...........");
    proceedingJoinPoint.proceed();
    System.out.println("Bon courage pour la vie professionnelle........");
    }
}
