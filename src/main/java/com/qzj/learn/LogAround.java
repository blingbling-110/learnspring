package com.qzj.learn;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogAround implements MethodInterceptor {
    private Logger logger = LogManager.getLogger("fileLogger");

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.log(Level.INFO, invocation.getArguments()[0] + " 开始日志记录");
        try {
            Object result = invocation.proceed();
            return result;
        }
        finally {
            logger.log(Level.INFO, invocation.getArguments()[0] + " 结束日志记录");
        }
    }
}
