package ru.ibs.spring.secondhw;


import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@EnableAspectJAutoProxy
@Aspect
@Service
public class AspException {


     @Pointcut("@annotation(ru.ibs.spring.secondhw.FuelExeprionHandler)")
     public void fuelExceptionHandle(){}




    /*@Around("fuelExceptionHandle")
    public Object tets(){

    }*/
}
