package com.qzj.learn;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ExceptionHandler implements ThrowsAdvice {
    private Logger logger = LogManager.getLogger("fileLogger");

    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass)
            throws Throwable {
        logger.log(Level.INFO, args[0] + " 执行" + method.getName() + "时有异常抛出...");
    }
}
