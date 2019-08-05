package com.qzj.learn;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Log implements ApplicationContextAware {
    private ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ac = applicationContext;
    }

    //通过publishEvent发布事件
    public int doLog(String logInfo) {
        LogEvent event = new LogEvent(logInfo);
        this.ac.publishEvent(event);
        return 0;
    }
}
