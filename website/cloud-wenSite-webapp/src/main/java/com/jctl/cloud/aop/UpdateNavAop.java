package com.jctl.cloud.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 动态更新导航栏
 */
@Component
@Aspect
public class UpdateNavAop {

    public UpdateNavAop() {
        System.out.print("********************************************************************************************************");
    }

    @Pointcut("execution(* com.jctl.cloud.web.*.get*(..))")
    public void checkUser(){
        System.out.println("**************The System is Searching Information For You****************");
    }


    @Before("execution(* com.jctl.cloud.web.*.get*(..))")
    public void beforeCheck(){
        System.out.println(">>>>>>>> 这是前置通知..........");
    }
//
//    @After("execution(* com.jctl.cloud.web.*.get*(..))")
//    public void afterCheck(){
//        System.out.println(">>>>>>>>　这是后置通知..........");
//    }
//
    @Around("checkUser()")
    public void aroundCheck(){
        System.out.println(">>>>>>>>　环绕通知..........");
    }



}
