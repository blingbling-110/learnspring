package com.qzj.learn;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimeHandler implements MethodInterceptor {
    private Logger logger = LogManager.getLogger("fileLogger");

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long procTime = System.currentTimeMillis();
        logger.log(Level.INFO, methodInvocation.getArguments()[0]
                + " 开始执行 " + methodInvocation.getMethod() + " 方法");
        try {
            Object result = methodInvocation.proceed();
            return result;
        } finally {
            //计算执行时间
            procTime = System.currentTimeMillis() - procTime;
            logger.log(Level.INFO, methodInvocation.getArguments()[0]
                    + " 执行 " + methodInvocation.getMethod() + " 方法结束");
            logger.log(Level.INFO, "执行 " + methodInvocation.getMethod().getName()
            + " 方法共用了 " + procTime + " 毫秒");
        }
    }
}
