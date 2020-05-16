package ru.itis.mushroomnasya.aspects;

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import ru.itis.mushroomnasya.dto.SignUpDto;

@Aspect
@Component
public class LoggingAspect {

    @Before(value = "execution(* ru.itis.mushroomnasya.service.SignUpServiceImpl.signUp(*))")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        SignUpDto form = (SignUpDto) args[0];
        System.out.println("Name of user " + form.getName() + " registered");
    }

    @SneakyThrows
    @Around(value = "execution(* ru.itis.mushroomnasya.service.SignUpService.signUp(*))")
    public Boolean time(ProceedingJoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        Boolean join = (Boolean) joinPoint.proceed(joinPoint.getArgs());
        long endTime = System.currentTimeMillis();
        System.out.println("Time of " + joinPoint.getSignature().getName() + " " + (startTime - endTime));
        return join;
    }

}
