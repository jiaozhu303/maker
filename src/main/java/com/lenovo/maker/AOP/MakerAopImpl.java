package com.lenovo.maker.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zhaodj5 on 2017-04-18.
 */
@Aspect
@Configuration
public class MakerAopImpl {

//    /*
//     * 定义一个切入点
//     */
//    // @Pointcut("execution (* findById*(..))")
//    @Pointcut("execution(* com.lenovo.maker.service.MakerService.get*(..))")
//    public void excudeService(){
//        System.out.println("AOP - @Pointcut ... ");
//    }
    /*
     * 通过连接点切入
     */
//    @Before("execution(* com.lenovo.maker.service.MakerService.get*(..)) && args(id,..)")
//    public void twiceAsOld1(Long id){
//        System.out.println ("AOP - 切面before执行了。。。。id==" + id);
//
//    }

    @Around("execution(* com.lenovo.maker.service.MakerService.get*(..))")
    public Object twiceAsOld(ProceedingJoinPoint thisJoinPoint){
        System.out.println ("AOP - 切面Around执行了。。。。");

        return null;
    }

}
