package com.qzj.learn;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
