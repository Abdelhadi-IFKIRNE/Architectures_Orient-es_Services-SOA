package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public aspect verifyAspect {

    @Around("execution(* service.*.ImetierImpl.getInformation(..))")
    public void verify(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Bonjour........");
        proceedingJoinPoint.proceed();
        System.out.println("bon courage dans la vie professionnelle.......");
    }
}
