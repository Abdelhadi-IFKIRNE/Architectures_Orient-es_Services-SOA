package org.example.apsects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.service.securityContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class security {
    Object proceed;
    @Around(value = "@annotation(securedByAspect)",argNames = "pjp,securedByAspect")
    public Object verifyAuthentication(ProceedingJoinPoint pjp,SecuredByAspect securedByAspect) throws Throwable {
     String[] roles= securedByAspect.roles();
     boolean isAuth=false;
        for (String r:roles) {
           if(securityContext.hasRole(r))
               isAuth=true;
        }
        if(isAuth) {
            proceed = pjp.proceed();
        } else {
            throw new RuntimeException("access Unauthorized......!");
        }
        return proceed;
    }
}
