package org.example.apsects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Journalisation {
    Logger logger=Logger.getLogger(Journalisation.class.getName());
    public Journalisation() throws IOException {
        this.logger.addHandler(new FileHandler("log.xml"));
        this.logger.setUseParentHandlers(true);
    }

    @Around("@annotation(org.example.apsects.Log)")
    public Object logging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       logger.info("avant..."+ proceedingJoinPoint.getTarget().getClass().toString());
        Object proceed = proceedingJoinPoint.proceed();
        logger.info("après...");
       return proceed;
    }
}
