package jpa.test.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopAspect1 {

    @Pointcut(value = "execution(* jpa.test.web.TestController.*(..))")
    public void test1(){};

    @Around(value = "test1()")
    public Object test2(ProceedingJoinPoint pjp) throws Throwable {
        log.info("test1-------------");
//        Object proceed = pjp.proceed();
        log.info("test1 over");

        return "test";
    }
}
