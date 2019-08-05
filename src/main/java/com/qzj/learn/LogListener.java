package com.qzj.learn;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof LogEvent) {
            //设定时间
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            format.setLenient(false);//禁用宽容解析
            String currentDate = format.format(new Date());
            System.out.println("输出时间：" + currentDate
                    + " 输出内容：" + event.toString());
        }
    }
}
