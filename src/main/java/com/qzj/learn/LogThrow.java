package com.qzj.learn;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class LogThrow implements ThrowsAdvice {
    private Logger logger = LogManager.getLogger("fileLogger");

    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass)
        throws Throwable {
        logger.log(Level.INFO, args[0] + " 审核数据有异常抛出...");
    }
}
