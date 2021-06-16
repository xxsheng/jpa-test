package jpa.test.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Order(Integer.MIN_VALUE)
public class AopAspect2 {

    @Pointcut(value = "execution(* jpa.test.web.TestController.*(..))")
    public void test1(){};

    @Around(value = "test1()")
    public Object test2(ProceedingJoinPoint pjp) throws Throwable {
        log.info("test2-------------");
        Object proceed = pjp.proceed();
        log.info("test2 over");

        return proceed;
    }
}
