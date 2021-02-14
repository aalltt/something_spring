package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAspect in Library trying returning book");
        System.out.println("aroundReturnBookLoggingAspect in Library returning book");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAspect exception" + e);

            targetMethodResult = "Unnamed book";
            throw e;
        }


        System.out.println("aroundReturnBookLoggingAspect in Library successfully returning book");

        return targetMethodResult;
    }
}
