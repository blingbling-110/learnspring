package com.qzj.learn;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBefore implements MethodBeforeAdvice {
    private Logger logger = LogManager.getLogger("fileLogger");

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        logger.log(Level.INFO, args[0] + " 开始日志记录");
    }
}
