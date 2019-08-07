package com.qzj.learn;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy implements InvocationHandler {
    private Logger logger = LogManager.getLogger("fileLogger");
    private Object delegate;

    //绑定代理对象
    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            logger.log(Level.INFO, args[0] + "开始记录日志");
            result = method.invoke(delegate, args);
            logger.log(Level.INFO, args[0] + "记录日志结束");
        }catch (Exception e){
            logger.log(Level.INFO, e.toString());
        }
        return result;
    }
}
